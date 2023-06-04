SELECT * FROM gringotts.wizzard_deposits;

--		1

SELECT COUNT(*) FROM wizzard_deposits; 

--		2

SELECT MAX(magic_wand_size) AS 'longest_magic_wand' FROM wizzard_deposits;

--		3

SELECT 
    `deposit_group`,
    MAX(`magic_wand_size`) AS 'longest_magic_wand'
FROM
    `wizzard_deposits`
GROUP BY `deposit_group`
ORDER BY longest_magic_wand , `deposit_group`;

--		4

SELECT `deposit_group` FROM `wizzard_deposits` GROUP BY deposit_group
  ORDER BY AVG(magic_wand_creator)
     LIMIT 1;
     
     --		5
     
     SELECT `deposit_group`, SUM(`deposit_amount`) AS 'total_sum'
FROM
    `wizzard_deposits`
GROUP BY `deposit_group`
ORDER BY total_sum;












