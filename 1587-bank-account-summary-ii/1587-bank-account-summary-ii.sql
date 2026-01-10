# Write your MySQL query statement below
select a.name , sum(t.amount ) as balance from Users a join Transactions t on a.account=t.account group by t.account having sum(t.amount )>10000 ; 