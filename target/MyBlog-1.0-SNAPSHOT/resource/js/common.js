$(document).ready(function(){

    $('.jump').click(function (e){
        $('.jump_page').css({'display':'block','left':e.pageX,'top':e.pageY});
    });

    $('.jump_close').click(function (){
        $('.jump_page').css({'display':'none'});
    });

    //菜单栏跟随屏幕效果代码
    $(document).scroll(function (){
        if($(document).scrollTop() >= 360 ){
            $('.sidebar').css({'position':'fixed','top':'25px','margin-left':'55.9em'});
        }else {
            $('.sidebar').css({'position':'static','margin-left':''});
        }
    });


    //百度搜索
    $('#formsearch').submit(function (){
        if($('#editbox_search').val() == ''){

            window.alert('请输入搜索内容');
            return false;
        }else{

            if($('#select select').val() == 'baidu'){

                window.open("http://www.baidu.com/s?wd="+$('#editbox_search').val());
                return false;
            }
        }
    });
    //百度搜索END

    //返回顶部效果代码
    $('#backtop').click(function(){
        $("body,html").animate({scrollTop:0},500);
    });
    //返回顶部效果代码END

    //表单不能为空提示效果
    $('#title').blur(function (){

        if($.trim($(this).val()) == ''){

            $('#title_error').text('请输入标题');
        }else {

            $('#title_error').text('');
        }
    });


    $('#author').blur(function (){

        if($.trim($(this).val()) == ''){

            $('#author_error').text('请输入标题');
        }else {

            $('#author_error').text('');
        }
    });

    $('#tag1,#tag2,#tag3').blur(function (){

        if($.trim($('#tag1').val()) == ''){

            $('#tag_error').text('请输入分类');
        }else {

            $('#tag_error').text('');
        }
    });

    $('#img_upload').change(function(){
        $('#img_name').text(this.value);
    });

    $('#content, #pName, #pEmail, #pMessage').blur(function (){

        if($.trim($(this).val()) == ''){
            $(this).next().text('内容不能为空');
        }else {
            $(this).next().text('');
        }
    });

    $('#authcode').blur(function (){
        if($.trim($(this).val()) == ''){
            $('#authcode_error').text('请填写验证码');
        }else {
            var authcode = $.trim($(this).val());
            $.ajax({
                url:'/checkCode',
                data:{'authcode':authcode,'p':'add'},
                type : "POST",
                async : true,
                success:function(data){
                    switch(data){
                        case 0:
                            $('#authcode_error').text('验证码过期');
                            changeImg('#captcha_img');
                            break;
                        case 1:
                            $('#authcode_error').text('');
                            $('#authcode_error').append("<img src='/resource/images/check_right.gif' style='border:0px;margin-top:-5px;'>");
                            break;
                        case 2:
                            $('#authcode_error').text('验证码错误');
                            changeImg('#captcha_img');
                            break;
                    }
                }
            });
            //$('#authcode_error').text('');
        }
    });

    $('#submit').submit(function (){
        var title = false;
        var tag = false;
        var author = false;
        var content = false;
        var authcode = false;
        if($.trim($('#title').val()) == ''){
            $('#title_error').text('请输入标题');
        }else {
            title = true;
        }
        if($.trim($('#selectType').val()) == ''){
            $('#tag_error').text('请输入分类');
        }else {
            tag = true;
        }
        if($.trim($('#content').val()) == ''){
            $('#content_error').text('请输入内容');
        }else {
            content = true;
        }
        if($('#author').val() ==''){
            $('#author_error').text('请输入内容');
        }else {
            author = true;
        }
        if($.trim($('#authcode').val()) == ''){
            $('#authcode_error').text('请填写验证码');
        }else {
            authcode = $.trim($('#authcode').val());
            $.ajax({
                url:"/checkCode",
                data:{'authcode':authcode},
                type : "POST",
                async : false,
                success:function(data){
                    switch(data){
                        case 0:
                            $('#authcode_error').text('验证码过期');
                            changeImg('#captcha_img');
                            authcode = false;
                            break;
                        case 1:
                            $('#authcode_error').text('');
                            $('#authcode_error').append("<img src='/resource/images/check_right.gif' style='border:0px;margin-top:-5px;'>");
                            authcode = true;
                            break;
                        case 2:
                            $('#authcode_error').text('验证码错误');
                            changeImg('#captcha_img');
                            authcode = false;
                            break;
                    }
                }
            });
        }
        alert( title +"-"+ tag +"-"+  content +"-"+ author +"-"+  authcode)
        if(title && tag && content && author && authcode){
            alert("true")
            return true;
        }
        return false;
    });
    //表单不能为空提示效果END

    //点击评论博客效果代码
    $("#respond_article").click(function(){
        if($('.respond').css('display') == 'none'){

            $(".respond").slideToggle(1000);
            $('#respond_article a').text('点击收起');
            $("body,html").animate({scrollTop:$(document).height()},1000);

        }else{

            $(".respond").slideToggle(1000,function(){
                $('#respond_article a').text('点击评论');
            });
        }
    });
    //点击评论博客效果代码END
});
//进入评论页，异步加载评论
function getAllComments(blogId, commentId) {
    $.ajax({
        url:"/getAllComments",
        type:"GET",
        data:"blogId=" + blogId,
        success:function (result) {
            new Vue({
                el:commentId,
                data: result,
                methods:{
                    //校验验证是否全部成功
                    submitValidate : function (errors, arguments, tarThis) {
                        //console.log(errors.items.length);
                        //console.log(arguments);
                        //console.log(tarThis)
                        if(errors.items.length > 0) {
                            alert("输入信息有误，请重新输入");
                            return false;
                        }
                        // var tarFormId = '#' + formId;

                        //VeeValidate.Validator.prototype.validateAll().then((result) => {});
                    },
                    //获取表单ID
                    getFormId:function (index) {
                      return "reply_submit" + index;
                    },
                    //改变验证码
                    changeCode:function (changeId) {
                        changeImg(changeId);
                    },
                    //生成验证码图片ID
                    getImageId:function (index) {
                        return  "captcha_img" + index;
                    },
                    //生成验证码输入框ID
                    getImputId:function (index) {
                        return  "authcode_reply" + index;
                    },
                    //生成验证码错误提示
                    getImageErrorId:function (index) {
                        return  "authcode_reply_error" + index;
                    },
                    //生成回复内容ID
                    getReplyNameId:function (index) {
                        return  "reply_content" + index;
                    },
                    //生成内容错误提示
                    getReplyNameErrorId:function (index) {
                        return  "reply_content_error" + index;
                    },
                    //生成回复人姓名ID
                    getReplyNameId:function (index) {
                      return  "reply_name" + index;
                    },
                    //生成姓名错误提示
                    getReplyNameErrorId:function (index) {
                        return  "reply_name_error" + index;
                    },
                    //获取时间
                    getDate:function (time) {
                        var date = new Date(time);
                        return date.toLocaleDateString() + date.toLocaleTimeString();
                    },
                    //生成点击回复ID
                    getReplyId:function (index){
                      return "replay" + index;
                    },
                    //生成回复评论ID
                    getReplyResponseId:function (index) {
                      return "replay_response" + index;
                    },
                    //显示回复框
                    displayReply:function (replyId, replyResponseId, event) {
                        var reply = '#'+replyId;
                        var replyResponse = '.'+replyResponseId;
                        if(event.target.innerText == '点击回复'){
                            $(replyResponse).slideToggle(1000);
                            $(reply).text('取消回复');
                        }else {
                            $(replyResponse).slideToggle(1000,function(){
                                $(reply).text('点击回复');
                            });
                        }
                    }
                },
            });

        }
    });
}
//主页初次加载
function to_page(pn) {
    $.ajax({
        url:"/getAllBlog",
        data: "pn=" + pn,
        type:"GET",
        success:function (result) {
            new Vue({
                el:".mainbar",
                data:
                result,
                methods:{
                    //获取评论a下span标签ID
                    getSpanId:function (index) {
                      return "span_comment" + index;
                    },
                    //根据博客ID获取评论数量
                    relCountComment:function (blogId, spanId) {
                        var trueSpanId = '#' + spanId;
                        var commentCount = getCountComment(blogId);
                        $(trueSpanId).text('( '+commentCount+' )').attr("disabled",true);
                        return true;
                    },
                    //评论
                    gotoComment:function (blogId) {
                        return "/getBlogComment?blogId=" + blogId;
                    },
                    //点击超链接搜索
                    searchSomething:function (target) {
                        return "/searchSomething?searchSelect=blog&editbox_search=" + target;
                    },
                    //转页
                    targetPage:function (targetPage) {
                        return "/getPageBlog?pn=" + targetPage;

                    },
                    //时间格式化
                    getDate:function (date) {
                        return new Date(date).getDate();
                    },
                    getYear:function (date) {
                        return new Date(date).getFullYear();
                    },
                    getMonth:function (date) {
                        return new Date(date).toDateString().substring(3,7);
                    },
                    //点击查看文章
                    display:function (arti_id, dis_id, disback_id, event) {
                        var display = '#'+dis_id;
                        var display_back = '#'+disback_id;
                        var arti_content = '#'+arti_id;
                        if(event.target.innerText == "点击查看文章") {
                            $(display).hide();
                            $(display_back).show();
                            $(arti_content).slideToggle(1000);
                        } else{
                            $(arti_content).slideToggle(1000,function(){
                                $(display_back).hide();
                                $(display).show();
                            });
                        }
                    },
                    //生成文章内容框 ID
                    generateArtiId:function (index) {
                        return "arti_content" + index;
                    },
                    //生成显示按钮 ID
                    generateDisId:function (index) {
                        return "display" + index;
                    },
                    //生成缩放内容按钮 ID
                    generateDisBackId:function (index) {
                        return "display_back" + index;
                    },
                    // 以下三个与enter相关的方法只会在元素由隐藏变为显示的时候才会执行
                    // el:指的是当前调用这个方法的元素对象
                    //done:用来决定是否要执行后续的代码如果不执行这个方法，那么将来执行完before执行完enter以后动画就会停止
                    beforeEnter:function (el) {
                        console.log("beforeEnter");
                        //入场之前会执行v-enter
                        el.style = "height:100px";
                        this.code = !this.code;
                    },
                    enter:function (el,done) {
                        // 当进行的过程中每执行 v-enter-active
                        console.log("enter");
                        // 为了能让代码正常进行，在设置了结束状态后必须调用一下这个元素的
                        // offsetHeight / offsetWeight  只是为了让动画执行
                        el.offsetHeight;
                        // 结束的状态最后写在enter中
                        el.style = "height:0px";
                        // 执行done继续向下执行
                        //done();
                    },
                    afterEnter: function (el) {
                        // 当执行完毕以后会执行
                        console.log("afterEnter");
                        this.isshow = false;
                    }
                },
                watch : {

                }
            });
        }
    });
}

//查出所有博客类型信息,传入发表博客的 select 标签，便于解耦
function getBlogTypes(selectId) {
    //清空之前下拉列表的值
    $(selectId).empty();
    $.ajax({
        url:"blogType/types",
        type:"GET",
        success:function(result) {
            //显示在控制台
            //console.log(result);
            //$("#addEmpModal select").append("<option></option>");
            $.each(result, function(index, item) {
                //若没有传参，即没有 item 参数，则用 this 表示当前 dept 对象
                var deptOption = $("<option></option>").append(item.blogTypeName).attr("value", item.blogTypeId);
                deptOption.appendTo(selectId);
            });

        }
    });
}

//改变验证码
function changeImg(change) {
    var imgSrc = $(change);
    var src = imgSrc.attr("src");
    imgSrc.attr("src",changeUrl(src));
}
// 时间戳
// 为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
function changeUrl(url) {
    var timestamp = (new Date()).valueOf();
    url = url.substring(0,20);
    if ((url.indexOf("&") >= 0)) {
        url = url + "×tamp=" + timestamp;
    } else {
        url = url + "?timestamp=" + timestamp;
    }
    return url;
}

//获取特定博客ID的评论数量
function getCountComment (blogId) {
    var commentCount;

    $.ajax({
        url:"/countMainComment",
        data:{"blogForeignId" : blogId},
        type:"POST",
        async:false,
        success:function (result) {
            commentCount = result;
        }
    });
    return commentCount;
}
//根据博客ID获取评论数量
function getRelCountComment(blogId, aId) {
    var commentCount = getCountComment(blogId);
    $(aId).text('评论( '+commentCount+' )');
    return true;
}

//contact提交验证
function contactSubmit (pName, pEmail, pMessage) {
        var name = false;
        var email = false;
        var message = false;
    if($.trim($(pName).val()) == ''){
        $(pName).next().text('请输入内容');
    }else {
        name = true;
    }
    if($.trim($(pEmail).val()) == ''){
        $(pEmail).next().text('请输入内容');
    }else {
        email = true;
    }
    if($.trim($(pMessage).val()) == ''){
        $(pMessage).next().text('请输入内容');
    }else {
        message = true;
    }
    if(name && email && message) {
        return true;
    }
    return false;
};