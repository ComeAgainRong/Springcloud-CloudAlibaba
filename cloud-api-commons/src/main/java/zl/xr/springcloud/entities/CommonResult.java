package zl.xr.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: 【 CommonResult 】
 * @Author : XiaoRong
 * @Date : Created in 15:51 2021/12/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public  CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
