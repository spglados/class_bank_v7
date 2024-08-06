package com.tenco.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignUpDTO {
	
	private String username;
	private String password;
	private String fullname;

	// todo - 추후 사진 업로드 기능 추가 예정
}
