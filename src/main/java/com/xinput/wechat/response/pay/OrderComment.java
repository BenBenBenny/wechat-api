package com.xinput.wechat.response.pay;/** * 订单评价 */public class OrderComment {    /**     * 评价时间     */    private String commentDateTime;    /**     * 支付订单号     */    private String transaction_id;    /**     * 评论星级     */    private Integer star;    /**     * 评论内容     */    private String comment;    public String getCommentDateTime() {        return commentDateTime;    }    public void setCommentDateTime(String commentDateTime) {        this.commentDateTime = commentDateTime;    }    public String getTransaction_id() {        return transaction_id;    }    public void setTransaction_id(String transaction_id) {        this.transaction_id = transaction_id;    }    public Integer getStar() {        return star;    }    public void setStar(Integer star) {        this.star = star;    }    public String getComment() {        return comment;    }    public void setComment(String comment) {        this.comment = comment;    }}