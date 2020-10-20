package com.eoms.annotion;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 自定义注解  service 注入bean容器

/**
 * Target 作用目标
 * @Target(ElementType.TYPE)——接口、类、枚举、注解
 * @Target(ElementType.FIELD)——字段、枚举的常量
 * @Target(ElementType.METHOD)——方法
 * @Target(ElementType.PARAMETER)——方法参数
 * @Target(ElementType.CONSTRUCTOR) ——构造函数
 * @Target(ElementType.LOCAL_VARIABLE)——局部变量
 * @Target(ElementType.ANNOTATION_TYPE)——注解
 * @Target(ElementType.PACKAGE)——包
 */
@Target(ElementType.TYPE)
/**
 * Retention  用来修饰注解 表示存留多久
 * source：注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃；被编译器忽略
 * class：注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期
 * runtime：注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在
 *  生命周期长度 SOURCE < CLASS < RUNTIME ，所以前者能作用的地方后者一定也能作用。
 *  一般如果需要在运行时去动态获取注解信息，那只能用 RUNTIME 注解；如果要在编译时进行一些预处理操作，
 *  比如生成一些辅助代码（如 ButterKnife），就用 CLASS注解；如果只是做一些检查性的操作，
 *  比如 @Override 和 @SuppressWarnings，则可选用 SOURCE 注解。
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SelfService {
}
