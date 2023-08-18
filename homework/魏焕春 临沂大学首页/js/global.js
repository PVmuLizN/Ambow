$(document).ready(function () {
      /*$(".tab-menu li").on('click', function(e) {
          e.preventDefault();
          $(".tabs .active").removeClass('selected');
          $(this).addClass('selected');
        });*/
       // 相关链接
       /*$(".site-link-item").each(function(index, el) {
		$(el).click(function() {
		      $(this).addClass('wrap-open').children('.sub-site-link').toggle(300).parent().removeClass('wrap-open')
		});
	});*/
	$(document).bind("click",function(e){
		var target = $(e.target);
		// if(target.closest(".site-link-item").length == 0){
			// $(".sub-site-link").hide();
		// }
	})
       
        $(".wp-menu .menu-item").each(function(){
            if(  $(this).children(".sub-menu-box").length == 0  ){
               $(this).addClass("nn");
            }
       })
       
     
      // $(".wp-menu .menu-item").addClass("nn");

	// loading效果
	function loading(){
		$("#loading").fadeOut(400);
		
		// 强制隐藏启动画面
		// setTimeout(function(){
		// 	$("#loading").fadeOut(400);
		// },3000)
	}
	// loading();
	document.onreadystatechange = function(){ 
		if(document.readyState == "complete"){ 
			loading();
		}
	}

	// header
	function autoheader(){
		if( $(window).scrollTop() > 140 ){
			$(".body_home").removeClass("showdiv");
			$(".fix-body").addClass("showdiv");
		}
		else{
			$(".fix-body").removeClass("showdiv");
			$(".body_home").addClass("showdiv");
		}
         
	}
	$(window).scroll(function () {
		autoheader();
	})
	autoheader();

	// 窗口滚动
	/*$(window).bind('mousewheel', function (event, delta, deltaX, deltaY) {
		var scrollTop = $(window).scrollTop();
		if (scrollTop == 0 && $('.fix-top').hasClass('fixed') && deltaY >= 0) {
			$('.fix-top').removeClass('fixed');
			$('body').removeClass('fixedok');
			setTimeout(function () {
				$(window).scrollTop(0);
				$('body').removeClass('fixed');
			}, 300);
		}
		if (!$('.fix-top').hasClass('fixed') && deltaY < 0) {
			$('.fix-top').addClass('fixed');
			$('body').addClass('fixed');
			setTimeout(function () {
				$(window).scrollTop(5);
				$('body').removeClass('fixed');
				$(window).scrollTop(0);
			}, 300);
			setTimeout(function () {
				$('body').addClass('fixedok');
			}, 800);
		}
	});*/
	// $(window).scrollTop(0);

	// 浏览器兼容性判断
	if (navigator.appName == "Microsoft Internet Explorer" && parseInt(navigator.appVersion.split(";")[1].replace(/[ ]/g, "").replace("MSIE", "")) <= 9) {
		document.getElementById('browser-modal').style.display = 'block';
		console.log("您的浏览器版本过低，请使用IE10以上版本");
	}
       
       // 返回顶部
      function scroll2top(){
	let btn = $("#scroll2Top"); // 获取元素
	btn.click(function(){  // 按钮添加点击事件
		$("body, html").stop(true, true).animate({
	             scrollTop: 0  // body和html添加动画
		}, 300)
	 });

	$(window).scroll(function(){ // 窗口滚动时，滚动到一定位置 btn 按钮显示/隐藏
		if( $(window).scrollTop() > $(window).height() ){
			btn.addClass('show');
		} else {
			btn.removeClass('show');
		}
	  });
        }
        // 初始化
        scroll2top();
       // 临大要闻占位图
       var ldyw= $("#ldyw .news_imgs, .news_img");
       ldyw.each(function(){
          if( !$(this).html().trim() ) {
            $(this).css({
                 "background":"url(/_upload/tpl/06/f1/1777/template1777/img/ldyw-placeholder.jpg) no-repeat center",
                 "background-size": "cover"
            })
          }
       });

      // 综合新闻占位图
       var zhxw = $("#zhxw .news_imgs");
       zhxw.each(function(){
          if( !$(this).html().trim() ) {
            $(this).css({
                 "background":"url(/_upload/tpl/06/f1/1777/template1777/img/zhxw-placeholder.jpg) no-repeat center",
                 "background-size": "cover"
            })
          }
       });

// 临大学术占位图
       var ldxs = $("#ldxs .news_imgs");
       ldxs.each(function(){
          if( !$(this).html().trim() ) {
            $(this).css({
                 "background":"url(/_upload/tpl/06/f1/1777/template1777/img/ldxs-placeholder.jpg) no-repeat center",
                 "background-size": "cover"
            })
          }
       });
      
       $('.close').click(function(){
          $("#search").css("display", "none");
       })
      $('.searchBtn').click(function(){
          $("#search").css("display", "block");
       })

});

(function(){
    $(".body_home").addClass("showdiv");
    setTimeout(function(){
        $(".body_home").addClass("s");
    },500);
});	