-- 코드를 입력하세요
SELECT B.AUTHOR_ID, A.AUTHOR_NAME, CATEGORY, SUM(PRICE * SALES) AS TOTAL_SALES
FROM BOOK B JOIN BOOK_SALES BS ON B.BOOK_ID = BS.BOOK_ID
JOIN AUTHOR A ON A.AUTHOR_ID = B.AUTHOR_ID
WHERE SALES_DATE LIKE '2022-01%'
GROUP BY 1, 3
ORDER BY 1, 3 DESC;