package jpamvcexam.mainview;

import jpamvcexam.model.vo.Book;

import javax.persistence.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JPASelectBookLab {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("emptest");
        EntityManager em = factory.createEntityManager();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("\n \t1. 모두 출력하기\n" + "	2. 가격이 높은 순으로 출력하기\n" + "	3. 20000 이상의 도서들만 출력하기\n"
                    + "	4. id가 3번인 도서들만 출력하기\n" + "	5. 도서명에 '자바' 또는 '스프링'을 포함하는 도서들만 출력하기\n" + "	6. 분류별 도서 가격의 합을 출력하기\n"
                    + "	7. 종료\n\n" + "원하는 메뉴의 번호를 선택하세요 : \n");
            int no = Integer.parseInt(scan.nextLine());

            // 1. 모두 출력하기
            if (no == 1) {
                TypedQuery<Book> b = em.createQuery("SELECT b FROM Book b ", Book.class);
                List<Book> resultList = b.getResultList();
                System.out.println(resultList);

            } // 2. 가격이 높은 순으로 출력하기
            else if (no == 2) {
                TypedQuery<Book> b = em.createQuery("SELECT b FROM Book b ORDER BY b.price DESC", Book.class);
                List<Book> resultList = b.getResultList();
                System.out.println(resultList);

            } // 3. 20000 이상의 도서들만 출력하기
            else if (no == 3) {
                TypedQuery<Book> b = em.createQuery("SELECT b FROM Book b WHERE b.price >= 20000", Book.class);
                List<Book> resultList = b.getResultList();
                System.out.println(resultList);

            } // 4. id가 3번인 도서들만 출력하기
            else if (no == 4) {
                Book result = em.find(Book.class, 3);
                if (result != null) {
                    System.out.println(result);
                } else {
                    System.out.println("id가 3번인 도서는 없습니다.");
                }

            } // 5. 도서명에 '자바' 또는 '스프링'을 포함하는 도서들만 출력하기
            else if (no == 5) {
                Random random = new Random();
                boolean rand = random.nextBoolean();
                TypedQuery<Book> b = em.createQuery("SELECT b FROM Book b WHERE b.title like :title", Book.class);
                if (rand == true) {
                    b.setParameter("title", "%자바%");
                } else {
                    b.setParameter("title", "%스프링%");
                }
                List<Book> resultList = b.getResultList();
                System.out.println(resultList);
            } // 6. 분류별 도서 가격의 합을 출력하기
            else if (no == 6) {
                Query query = em.createQuery("SELECT b.kind, sum(b.price) FROM Book b WHERE b.kind IS NOT NULL GROUP BY b.kind ");
                List<Object[]> resultList = query.getResultList();
                for (Object[] objects : resultList) {
                    System.out.println(objects[0] + " : " + objects[1]);
                }
            } else if (no == 7) {
                System.out.printf("시스템을 종료합니다.");
                break;
            }

            System.out.print("\n계속 검색하시겠습니까?(y/n)");
            String aws = scan.nextLine();
            // equalsIgnorCase : 대소문자 구분 없이
            if (aws.equalsIgnoreCase("y")) {
                continue;
            }
            System.out.printf("시스템을 종료합니다.");
            break;
        }
        scan.close();
        em.close();
        factory.close();
    }


}




