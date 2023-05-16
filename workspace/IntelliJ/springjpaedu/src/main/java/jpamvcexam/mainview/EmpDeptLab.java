package jpamvcexam.mainview;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmpDeptLab {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("emptest");
        EntityManager em = factory.createEntityManager();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean result = random.nextBoolean();

        if (result){
            System.out.println("부서명을 입력하세요 : ");
            String input = scanner.nextLine();
            scanner.close();

            String jpql = "SELECT e.ENAME FROM Emp e JOIN e.dept d WHERE d.DNAME = :dn";
            TypedQuery<String> q = em.createQuery(jpql, String.class);
            q.setParameter("dn", input);
            List<String> list = q.getResultList();
            if(list.size() == 0) {
                System.out.println("부서명을 찾을 수 없네요..ᅮᅮ");
            } else {
                System.out.printf("%s 부서의 직원들입니다... \n ", input);
                list.stream().forEach(System.out::println);

            }
            em.close();
            factory.close();
        } else {
            System.out.println("사원명을 입력하세요 : ");
            String input = scanner.nextLine();
            scanner.close();
            String jpql = "SELECT d.DNAME FROM Emp e JOIN e.dept d WHERE e.ENAME = :en";
            TypedQuery<String> q = em.createQuery(jpql, String.class);
            q.setParameter("en", input);
            List<String> list = q.getResultList();
            if(list.size() == 0) {
                System.out.println("직원을 찾을 수 없네요..ᅮᅮ ");
            } else {
                System.out.printf("%s님의 부서명은 %s입니다...\n", input, list.get(0));

            }
            em.close();
            factory.close();
        }


    }
}
