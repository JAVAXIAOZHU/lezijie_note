package comlezijie.note.po;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private Integer userId;   //用户Id
    private String uname;     //用户名称
    private String upwd;      //用户密码
    private String nick;      //用户昵称
    private String head;      //用户头像
    private String mood;      //用户签名
}
