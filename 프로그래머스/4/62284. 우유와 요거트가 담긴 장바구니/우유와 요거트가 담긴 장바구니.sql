-- 코드를 입력하세요
SELECT DISTINCT C1.CART_ID
FROM CART_PRODUCTS C1 JOIN CART_PRODUCTS C2 ON C1.CART_ID = C2.CART_ID
WHERE (C1.NAME = 'Milk' and C2.NAME = 'Yogurt') or (C2.NAME = 'Milk' and C1.NAME = 'Yogurt')