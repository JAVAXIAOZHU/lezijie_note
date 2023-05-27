package comlezijie.note.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class NoteVo implements Serializable {
    private  String groupName;//分组名称
    private long noteCount;//云记数量

    private Integer typeId;//类型id

}
