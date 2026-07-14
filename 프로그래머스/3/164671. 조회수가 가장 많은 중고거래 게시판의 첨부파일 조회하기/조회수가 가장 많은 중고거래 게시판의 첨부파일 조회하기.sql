-- 코드를 입력하세요
# SELECT
#     AS FILE_PATH
# FROM


SELECT
    CONCAT('/home/grep/src/', 
           UGF.BOARD_ID, '/', 
           UGF.FILE_ID, 
           UGF.FILE_NAME, 
           UGF.FILE_EXT) AS FILE_PATH
FROM
    USED_GOODS_FILE AS UGF
JOIN
    (SELECT
        BOARD_ID
    FROM
        USED_GOODS_BOARD
    WHERE
        VIEWS = (
            SELECT 
                MAX(VIEWS)
            FROM
                USED_GOODS_BOARD
            )
     ) UGB
 ON UGB.BOARD_ID = UGF.BOARD_ID
 ORDER BY
    FILE_ID DESC;
 
        

