package com.ccunix.ihousekeeping.basedb.domain;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;
public class Book extends Base_Model_Business {
private Integer count;
public void setCount(Integer count){
this.count=count;
}
public Integer getCount(){
return this.count;
}
private String book;
public void setBook(String book){
this.book=book;
}
public String getBook(){
return this.book;
}
}
