package com.kh.demo.web.api.product;

import lombok.Data;

@Data
public class EditReq {
  private String pname;   //상품명
  private Long quantity;  //수량
  private Long price;     //가격
}
