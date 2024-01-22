package com.sprata.spring_prepare;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor  --final 필드가 있어야한다. 
public class memo {
    private String username;
    private String contents;
}