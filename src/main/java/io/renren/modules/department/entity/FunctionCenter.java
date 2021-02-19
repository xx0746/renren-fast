package io.renren.modules.department.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 职能中心
 * </p>
 *
 * @author java
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="FunctionCenter对象", description="职能中心")
public class FunctionCenter implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @ExcelIgnore
    private String id;

    @ApiModelProperty(value = "序号")
    @TableField("sortId")
    @ExcelProperty(index = 0,value = "序号")
    private String sortId;

    @ApiModelProperty(value = "姓名")
    @ExcelProperty(index = 1,value = "姓名")
    private String name;

//    @ApiModelProperty(value = "级别")
//    @ExcelProperty(index = 2,value = "级别")
//    private String level;

    @ApiModelProperty(value = "工作业绩")
    @ExcelProperty(index = 2,value = "工作业绩 50%")
    private String wordLoad;

    @ApiModelProperty(value = "履职能力")
    @ExcelProperty(index = 3,value = "履职能力 30%")
    private String knowledgeSkills;

    @ApiModelProperty(value = "工作纪律")
    @TableField("Communication_collaboration")
    @ExcelProperty(index = 4,value = "工作纪律 10%")
    private String communicationCollaboration;

    @ApiModelProperty(value = "服务态度")
    @ExcelProperty(index = 5,value = "服务态度 10%")
    private String learningInnovation;

//    @ApiModelProperty(value = "工作责任心")
//    @ExcelProperty(index = 7,value = "工作责任心 6%")
//    private String jobResponsibility;
//
//    @ApiModelProperty(value = "工作纪律")
//    @ExcelProperty(index = 8,value = "工作纪律 6%")
//    private String workingDiscipline;

    @ApiModelProperty(value = "考核结果")
    @ExcelProperty(index = 6,value = "考核结果")
    private String evaluationResult;

    @ApiModelProperty(value = "考核等级")
    @ExcelProperty(index = 7,value = "考核等级")
    private String evaluationLevel;

    @ApiModelProperty(value = "绩效")
    @ExcelProperty(index = 8,value = "绩效")
    private String performance;

    @ApiModelProperty(value = "备注")
    @ExcelProperty(index = 9,value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    @ExcelIgnore
    private String createTime;


    @Override
    public String toString() {
        return "FunctionCenter{" +
                "id='" + id + '\'' +
                ", sortId='" + sortId + '\'' +
                ", name='" + name + '\'' +
//                ", level='" + level + '\'' +
                ", wordLoad='" + wordLoad + '\'' +
                ", knowledgeSkills='" + knowledgeSkills + '\'' +
                ", communicationCollaboration='" + communicationCollaboration + '\'' +
                ", learningInnovation='" + learningInnovation + '\'' +
//                ", jobResponsibility='" + jobResponsibility + '\'' +
//                ", workingDiscipline='" + workingDiscipline + '\'' +
                ", evaluationResult='" + evaluationResult + '\'' +
                ", evaluationLevel='" + evaluationLevel + '\'' +
                ", performance='" + performance + '\'' +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}