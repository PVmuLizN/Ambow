# Mon Aug 14 09:31:09 CST 2023

## HTML

### 标签

-   行标签
-   块标签
    > 独立占一行
-   `div`
-   `ol`: order
-   `ul`: unordered list
    > `<ul type="circle">` (this is deprecated)
-   `li`: in ordered list or unordered list
-   `em`
-   `strong`
-   图片:
    -   `<img title="" src="" alt="">`
    -   `title`
        > The title attribute on an <img> tag adds a tooltip with title text to the image.
        > Hovering the mouse over the image will display the tooltip.
-   超链接
    -   `<a href="http://www.jd.com" target="_blank">jd blank</a>`
        > `target` where to open the link , here is in a blank window
    -   `style=text-decoration: none`:
        > 去除下划线

### 属性

-   id 不可重复
-   name 可重复
-   `input`
    > `<input type="text" name="" value="">`
- `anchor`

### 特殊字符

`>`,`<` 等
![特殊字符](img/网页特殊符号HTML代码大全-阿里云开发者社区.png)

### `style` 控制

-   属性之间分号
-   属性与值之间`:`
-   `style` in `head`
-   `border`: 边框
    > `border: 1px, solid, black;`
-   `width`
    > `width: 500px;`  
    > 推荐使用百分比：`width: 60%`;
-   `height`
    > `height: 600px;`
-   `margin` : 外边距
    > `margin: auto 0;`  
    > from border of content to the border of browser  
    > `margin: 10 , 20 ,30 ,40;`: 上，右， 下， 左  
    > `margin: 0 auto;` 上， 右。 上：0. 左右：auto  
    > `margin: 10;` 上下是 10
-   `text-align`
-   `clear: both;`
    > 消除上一个 div 和下一个 div 的影响
-   `text-decoration: none`
    > 无下划线

### 术语

-   标准流
-   浮动
    > `float: left;`: 从浏览器左边开始排列。脱离原标准流，按新标准排列  
    > `left`, `right`
-   相对路径与绝对路径
