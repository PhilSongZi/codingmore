CREATE TABLE `posts` (
                         `post_id` int NOT NULL,
                         `post_author` varchar(10) NOT NULL,
                         `post_date` varchar(10) NOT NULL,
                         `post_content` varchar(50) NOT NULL,
                         `post_title` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `posts`
    ADD PRIMARY KEY (`post_id`);

INSERT INTO `posts` (`post_id`, `post_author`, `post_date`, `post_content`, `post_title`) VALUES ('1', '小子松', '2023-5-24', 'This is Test1', 'test1');
