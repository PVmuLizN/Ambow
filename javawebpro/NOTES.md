**Mon Aug 14 09:31:09 CST 2023**

# HTML

## 标签

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
-   `<form></form>`
    -   action:url address
    -   method
        -   get
            > 通过浏览器地址发送信息到服务器,不能超出 1k，而且不能是重要数据
            > `key1=value1&key2=value2`
        -   post
            > 通过请求体发送信息到服务器
    -   autocomplete:
        > 是否缓存到浏览器内，默认保存
    -   `<label></label>`
-   `<input>`
    -   type=
        > text, submit,
-   select : 下拉框
    ```html
    <select>
        <option></option>
        <option></option>
        <option></option>
    </select>
    ```
-   table
    -   合并列

## 属性

-   id 不可重复
-   name 可重复
-   `input`
    > `<input type="text" name="" value="">`
-   `anchor`
-   `placeholder`
    > 提示信息，hover the mouse on the element
-   input attributes:
    > Here is a table of input type values for HTML:
    >
    > | Input Type     | Description                                                                   |
    > | -------------- | ----------------------------------------------------------------------------- |
    > | button         | A button that can be used to submit a form or perform an action.              |
    > | checkbox       | A checkbox that can be used to select one or more options.                    |
    > | color          | A control for specifying a color.                                             |
    > | date           | A control for entering a date.                                                |
    > | datetime-local | A control for entering a date and time.                                       |
    > | email          | A control for entering an email address.                                      |
    > | file           | A control for uploading a file.                                               |
    > | hidden         | A hidden input field that is not visible to the user.                         |
    > | image          | An image that can be used as a submit button.                                 |
    > | month          | A control for entering a month.                                               |
    > | number         | A control for entering a number.                                              |
    > | password       | A password field that hides the entered text.                                 |
    > | radio          | A radio button that can be used to select one option from a group of options. |
    > | range          | A control for entering a value within a specified range.                      |
    > | reset          | A button that resets the form to its initial state.                           |
    > | search         | A text field that is used for searching.                                      |
    > | submit         | A button that submits the form.                                               |
    > | tel            | A control for entering a telephone number.                                    |
    > | text           | A single-line text field.                                                     |
    > | time           | A control for entering a time.                                                |
    > | url            | A control for entering a URL address.                                         |
    > | week           | A control for entering a week.                                                |
    >
    > I hope this is helpful! Let me know if you have any other questions.

## 特殊字符

`>`,`<` 等
![特殊字符](img/网页特殊符号HTML代码大全-阿里云开发者社区.png)

## `style` 控制

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

## 术语

-   标准流
-   浮动
    > `float: left;`: 从浏览器左边开始排列。脱离原标准流，按新标准排列  
    > `left`, `right`
-   相对路径与绝对路径
-   状态保持
    > The hidden input type is used to store data that is not visible to the user. This data can be used to maintain the status of a form, such as the current page number or the selected filter options.
    >
    > For example, you could use a hidden input field to store the current page number of a paginated list. When the user clicks on the next or previous page button, the value of the hidden input field is updated to the new page number. This allows the form to keep track of the user's current position in the list, even if they refresh the page or navigate away from the form.
    >
    > Another example of using the hidden input type to maintain status is to store the selected filter options in a form. When the user changes the filter options, the values of the hidden input fields are updated to reflect the new selections. This allows the form to re-populate the list with the filtered results, even if the user refreshes the page or navigates away from the form.
    >
    > The hidden input type is a powerful tool for maintaining the status of a form. By storing data that is not visible to the user, you can ensure that the form retains its state even when the user interacts with it.
    >
    > Here is an example of how to use the hidden input type to maintain status:
    >
    > ```html
    > <form action="/search" method="get">
    >     <input type="hidden" name="page" value="1" />
    >     <input type="hidden" name="filter" value="all" />
    >     <input type="text" name="query" placeholder="Search" />
    >     <input type="submit" value="Search" />
    > </form>
    > ```
    >
    > In this example, the hidden input fields `page` and `filter` are used to store the current page number and the selected filter options. When the user clicks on the submit button, the values of these hidden input fields are included in the form data that is submitted to the server. This allows the server to re-populate the list with the filtered results, even if the user refreshes the page or navigates away from the form.

# CSS

## 外部样式

## 内联

## 选择器

Sure, here is a list of all the values of CSS selectors:

**Simple selectors**

-   **Element selectors**
    -   `h1`
    -   `p`
    -   `a`
-   **Class selectors**
    -   `.my-class`
    -   `.class1.class2`
-   **Id selectors**
    -   `#my-id`

**Attribute selectors**

-   `[attribute]`
    -   `[href]`
    -   `[class="my-class"]`
    -   `[title~="flower"]`

**Pseudo-class selectors**

-   `:hover`
    -   `:focus`
    -   `:visited`
    -   `:enabled`
    -   `:disabled`

**Pseudo-element selectors**

-   `::before`
    -   `::after`

**Combined selectors**

-   `.my-class #my-id`
-   `h1 + p`
-   `h1 ~ p`

**Combinators**

-   `>`
-   `+`
-   `~`
-   `^`
-   `$`
-   `*`

I hope this is helpful! Let me know if you have any other questions.

## 优先级

Sure, here are the details of the priorities of CSS selectors:

-   **ID selectors** have the highest priority. This is because ID selectors are unique to each element. For example, the selector `#my-id` will only match the element with the ID `my-id`.
-   **Class selectors** have a lower priority than ID selectors. This is because class selectors can be applied to multiple elements. For example, the selector `.my-class` can be applied to any element with the class `my-class`.
-   **Type selectors** have a lower priority than class selectors. This is because type selectors match all elements of a particular type. For example, the selector `h1` will match all `h1` elements.
-   **Attribute selectors** have a lower priority than type selectors. This is because attribute selectors match elements that have a specific attribute. For example, the selector `[href]` will match all elements with an `href` attribute.
-   **Pseudo-class selectors** have a lower priority than attribute selectors. This is because pseudo-class selectors match elements based on their state or condition. For example, the selector `:hover` will match elements when the mouse is hovering over them.
-   **Pseudo-element selectors** have the lowest priority. This is because pseudo-element selectors match parts of elements. For example, the selector `::after` will match the content after an element.

The number of times a selector appears in a style sheet also affects its priority. If a selector appears multiple times in a style sheet, the priority will be increased each time it appears. For example, the following CSS will style the element with the ID `my-id` red:

```css
#my-id {
    color: red;
}

#my-id {
    color: blue;
}
```

The `#my-id` selector will have a priority of 2 because it appears twice in the style sheet. This means that the second declaration, which sets the color to blue, will be ignored.

The order of the selectors in a style sheet also affects their priority. Selectors that appear earlier in a style sheet have a higher priority than selectors that appear later. For example, the following CSS will style the element with the ID `my-id` red:

```css
.my-class {
    color: blue;
}

#my-id {
    color: red;
}
```

The `#my-id` selector will have a higher priority than the `.my-class` selector because it appears earlier in the style sheet. This means that the element with the ID `my-id` will be styled red, even though the `.my-class` selector also specifies a color of blue.

The `!important` rule overrides the default priority of a selector. This means that the `!important` rule will always be used, regardless of the order or number of times it appears in a style sheet. For example, the following CSS will style the element with the ID `my-id` blue, even though the `.my-class` selector specifies a color of red:

```css
#my-id {
    color: red !important;
}

.my-class {
    color: blue;
}
```

I hope this helps! Let me know if you have any other questions.

## Attributes

### border

[1]: https://developer.mozilla.org/en-US/docs/Web/CSS/border
[2]: https://www.w3schools.com/cssref/pr_border.php
[3]: https://www.geeksforgeeks.org/css-border-property/
[4]: https://www.w3schools.com/css/css_border.asp

There are three main border attributes in CSS: border-width, border-style, and border-color. Each of these attributes can have different values that affect the appearance of the border. Here is a list of the possible values for each attribute:

-   **border-width**: This attribute specifies the thickness of the border. It can be a fixed value (such as 5px, 1em, etc.), a keyword (such as thin, medium, or thick), or a global value (such as inherit, initial, or unset). The default value is medium[^1^][1].
-   **border-style**: This attribute specifies the style of the border. It can be one of the following values: none (no border), hidden (same as none, but also prevents conflicts with other borders), dotted (a series of dots), dashed (a series of dashes), solid (a single line), double (two parallel lines), groove (a 3D groove effect), ridge (a 3D ridge effect), inset (a 3D inset effect), outset (a 3D outset effect), or a global value. The default value is none[^1^][1].
-   **border-color**: This attribute specifies the color of the border. It can be a color name (such as red, blue, etc.), a hexadecimal value (such as #ff0000, #00ff00, etc.), an RGB value (such as rgb(255,0,0), rgb(0,255,0), etc.), an RGBA value (such as rgba(255,0,0,0.5), rgba(0,255,0,0.5), etc.), an HSL value (such as hsl(0,100%,50%), hsl(120,100%,50%), etc.), an HSLA value (such as hsla(0,100%,50%,0.5), hsla(120,100%,50%,0.5), etc.), a currentColor value (the same color as the text), or a global value. The default value is currentColor[^1^][1].

You can use the border shorthand property to set all three attributes at once. For example, `border: 5px solid red` will create a 5-pixel thick solid red border around the element[^2^][2]. You can also use the individual properties to set different values for each side of the element. For example, `border-top: 3px dashed green` will create a 3-pixel thick dashed green border on the top side of the element[^2^][2].

I hope this helps you understand the CSS border properties better. If you want to learn more about them or see some examples, you can check out these links:

-   [border - CSS: Cascading Style Sheets | MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border)
-   [CSS Borders - W3Schools](https://www.w3schools.com/css/css_border.asp)
-   [CSS border property - GeeksforGeeks](https://www.geeksforgeeks.org/css-border-property/)

### align

[1]: https://www.w3schools.com/csS/css_align.asp
[2]: https://developer.mozilla.org/en-US/docs/Web/CSS/align-items
[3]: https://www.geeksforgeeks.org/html-align-attribute/
[4]: https://www.geeksforgeeks.org/html-img-align-attribute/

There are several CSS properties that are related to the alignment of elements, such as text, images, flex items, grid items, etc. Some of the most common ones are:

-   **text-align**: This property specifies the horizontal alignment of the text within a block element or a table cell. It can take values such as `left`, `right`, `center`, `justify`, and `inherit`[^1^][1].
-   **vertical-align**: This property specifies the vertical alignment of an inline or table-cell element. It can take values such as `baseline`, `top`, `middle`, `bottom`, `sub`, `super`, and `inherit`[^2^][2].
-   **align-items**: This property specifies the default alignment for items inside a flex container or a grid container. It can take values such as `normal`, `stretch`, `center`, `start`, `end`, `flex-start`, `flex-end`, `self-start`, `self-end`, and `baseline`[^3^][3].
-   **align-self**: This property overrides the align-items value for a specific flex item or grid item. It can take the same values as align-items, plus a value of `auto`[^4^][4].
-   **align-content**: This property aligns a flex container's lines within the flex container when there is extra space on the cross-axis. It can take values such as `normal`, `stretch`, `center`, `start`, `end`, `flex-start`, `flex-end`, and `space-between`.

These are some of the most commonly used CSS properties for alignment, but there are more that you can explore in the [CSS reference]. I hope this helps you with your web development project. 😊

# javascript

## 历史

网景
ECMA 规范

## 运行

-   无编译
-   由浏览器内的 javascript 引擎执行

## 规范

-   ECMAScript
-   DOM: Document Object Model
-   BOM: Browser Object Model
