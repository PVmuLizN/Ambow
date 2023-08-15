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
