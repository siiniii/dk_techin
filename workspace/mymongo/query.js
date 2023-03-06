// 부서별로 50살 이상의 직원이 몇명인지 출력함
db.emps.aggregatae([
    {$match: {age:{$gte:50}}},
    {$group: {_id:"$dept_id", count:{"$sum":1}}}
]);