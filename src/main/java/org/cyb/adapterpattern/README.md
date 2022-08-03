## 适配器模式
### 代码
ITarget表示要转化的接口定义，Adaptee是一组不兼容ITarget接口定义的接口，Adaptor将Adaptee转化成一组
符合ITarget接口定义的接口、
```java
// 类适配器
public interface ITaget {
    void f1();
    void f2();
    void fc();
}

public class Adaptee {
    public void fa() {}
    public void fb() {}
    public void fc() {}
}

public class Adaptor extends Adaptee implements ITarget {
    public void f1() {
        super.fa();
    }
    
    public void f2() {
        // 重新实现
    }
    
    // fc不需要实现
}
```

```java
// 对象适配器
public interface ITaget {
    void f1();
    void f2();
    void fc();
}

public class Adaptee {
    public void fa() {}
    public void fb() {}
    public void fc() {}
}

public class Adaptor implements ITarget {
    private Adaptee adaptee;
    
    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    public void f1() {
        adaptee.fa();
    }
    
    public void f2() {
        // 重新实现
    }
    
    public void fc() {
        adaptee.fc();
    }
}
```

如果Adaptee接口很多，
- 当Adaptee和ITarget接口定义大部分相同，
那我们推荐使用类适配器，因为Adaptor复用父类Adaptee的接口。
- 当Adaptee和ITarget接口定义大部分都不相同，那我们推荐使用对象
适配器，因为组合结构相对于继承更加灵活。

## 总结
- 代理模式：代理模式在不改变原始类接口的条件下，为原始类定义一个代理类，主要目的是控制访问，而非加强功能，这是它跟装饰器模式最大的不同。
- 桥接模式：桥接模式的目的是将接口部分和实现部分分离，从而让它们可以较为容易、也相对独立地加以改变。
- 装饰器模式：装饰器模式在不改变原始类接口的情况下，对原始类功能进行增强，并且支持多个装饰器的嵌套使用。
- 适配器模式：适配器模式是一种事后补救策略。适配器提供原始类不同的接口，而代理模式、装饰器模式提供的都是跟原始类相同的接口。