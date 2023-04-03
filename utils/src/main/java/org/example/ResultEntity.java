package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultEntity<T> {

    private String result; //结果
    private String message;//失败信息
    private T data;// 返回数据

    private static final String SUCCESS="SUCCESS";
    private static final String FAILED="FAILED";

    /**
     * 成功不携带数据的统一格式 比如增删改
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> successWithoutData(){
        return new ResultEntity<Type>(SUCCESS,"success",null);
    }

    /**
     * 成功携带数据的统一格式 比如查询
     * @param data
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> successWithData(Type data){
        return new ResultEntity<Type>(SUCCESS,null,data);
    }


    /**
     * 返回操作失败
     * @param message
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> failed(String message){
        return new ResultEntity<Type>(FAILED,message,null);
    }


}

