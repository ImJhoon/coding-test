-- 코드를 입력하세요
SELECT * FROM ANIMAL_INS;

# SELECT
#     ANIMAL_ID,
#     NAME,
#     CASE
#         WHEN 
#             SEX_UPON_INTAKE LIKE 'Neutered%'
#             OR SEX_UPON_INTAKE LIKE 'Spayed%'
#             THEN 'O'
#         ELSE 'X'
#     END
#     AS '중성화'
# FROM
#     ANIMAL_INS;

SELECT
    ANIMAL_ID,
    NAME,
    IF(SEX_UPON_INTAKE LIKE 'Neutered%' 
       OR SEX_UPON_INTAKE LIKE 'Spayed%', 
       'O', -- THEN
       'X'  -- ELSE
      )
       AS '중성화'
FROM
    ANIMAL_INS;