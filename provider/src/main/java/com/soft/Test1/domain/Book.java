package com.soft.Test1.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "book")
public class Book {
    /**
     * 图书编号
     */
    @TableId(value = "book_id", type = IdType.INPUT)
    private Integer bookId;

    /**
     * 图书名称
     */
    @TableField(value = "book_name")
    private String bookName;

    /**
     * 图书标准ISBN编号
     */
    @TableField(value = "book_isbn")
    private String bookIsbn;

    /**
     * 图书出版社
     */
    @TableField(value = "book_press")
    private String bookPress;

    /**
     * 图书作者
     */
    @TableField(value = "book_author")
    private String bookAuthor;

    /**
     * 图书页数
     */
    @TableField(value = "book_pagination")
    private Integer bookPagination;

    /**
     * 图书价格
     */
    @TableField(value = "book_price")
    private Double bookPrice;

    /**
     * 图书上架时间
     */
    @TableField(value = "book_uploadtime")
    private String bookUploadtime;

    /**
     * 图书状态（0：可借阅，1:已借阅，2：归还中，3：已下架）
     */
    @TableField(value = "book_status")
    private String bookStatus;

    /**
     * 图书借阅人
     */
    @TableField(value = "book_borrower")
    private String bookBorrower;

    /**
     * 图书借阅时间
     */
    @TableField(value = "book_borrowtime")
    private String bookBorrowtime;

    /**
     * 图书预计归还时间
     */
    @TableField(value = "book_returntime")
    private String bookReturntime;

    public static final String COL_BOOK_ID = "book_id";

    public static final String COL_BOOK_NAME = "book_name";

    public static final String COL_BOOK_ISBN = "book_isbn";

    public static final String COL_BOOK_PRESS = "book_press";

    public static final String COL_BOOK_AUTHOR = "book_author";

    public static final String COL_BOOK_PAGINATION = "book_pagination";

    public static final String COL_BOOK_PRICE = "book_price";

    public static final String COL_BOOK_UPLOADTIME = "book_uploadtime";

    public static final String COL_BOOK_STATUS = "book_status";

    public static final String COL_BOOK_BORROWER = "book_borrower";

    public static final String COL_BOOK_BORROWTIME = "book_borrowtime";

    public static final String COL_BOOK_RETURNTIME = "book_returntime";
}