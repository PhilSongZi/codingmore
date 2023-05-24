CREATE TABLE `user` (
                        `id` int NOT NULL,
                        `name` varchar(10) NOT NULL,
                        `password` varchar(10) NOT NULL,
                        `age` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- 转储表的索引
--

--
-- 表的索引 `user`
--
ALTER TABLE `user`
    ADD PRIMARY KEY (`id`);
COMMIT;

-- 插入一条数据
INSERT INTO `user` (`id`, `name`, `password`, `age`) VALUES ('1', '沉默王二', ' 123456', '18');