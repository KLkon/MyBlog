<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/26
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="date" uri="http://datetag.tag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>我的博客</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link href="resource/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="resource/css/style.css" rel="stylesheet" type="text/css" />
    <link href="resource/images/blog.jpg" rel="icon" />
    <script type="text/javascript" src="resource/js/vue.min.js"></script>
    <!--vee-validate验证插件-->
    <!-- jsdelivr cdn -->
    <script type="text/javascript" src="resource/js/vee-validate.js"></script>
    <script type="text/javascript" src="resource/js/zh_CN.js"></script>
    <script type="text/javascript" src="resource/js/vue-i18n.js"></script>
    <script type="text/javascript" src="resource/js/jquery.min.js"></script>
    <script type="text/javascript" src="resource/js/common.js"></script>
</head>
<body>
<div class="main">
    <div class="header">
        <div class="header_resize">
            <div class="logo">
                <h1 id="animate_logo">
                    <a href="#"><img src="resource/images/logo.jpg" width="48" height="50" alt="logo" /></a>
                    <a href="index3.jsp">我的 <span>博客</span> <small>博客主页</small></a>
                </h1>
            </div>
            <div class="menu_nav">
                <ul>
                    <li class="active"><a href="index.jsp">主页</a></li>
                    <li><a href="support.html">支持</a></li>
                    <li><a href="addArticle.html">博客</a></li>
                    <li><a href="contact.html">联系我</a></li>
                </ul>
            </div>
            <div class="clr"></div>
        </div>
    </div>

    <div class="hbg">&nbsp;</div>

    <div class="content">
        <div class="content_resize">
            <div class="mainbar">
                <input type="image" src="resource/images/backtop.gif" id="backtop">
                <div id="add_article">
                    <a href="addArticle.html">发表博客</a>
                </div>

                <!---------------------------------------------------------------------->
                <!--博客-->
                <c:if test="${blog != null}">
                    <div class="article">
                            <p class="date">
                                <fmt:formatDate value="${blog.blogSubmitDate}" pattern="MMM"/>
                                <span>${blog.blogSubmitDate.date}</span>
                                <fmt:formatDate value="${blog.blogSubmitDate}" pattern="yyyy"/>
                            </p>

                            <h2><span>${blog.blogArticleTitle}</span></h2>
                            <p class="subh2"><fmt:formatDate value="${blog.blogSubmitDate}" pattern="HH:mm:ss"/>&nbsp;&nbsp;<a href="https://github.com/KLkon" title="GitHub">我的空间</a></p>
                            <p>
                                发布者 <a href="/searchSomething?searchSelect=blog&editbox_search=${blog.blogAuthor}">${blog.blogAuthor}</a> &nbsp;|&nbsp;
                                分类 <a href="/searchSomething?searchSelect=blog&editbox_search=${blog.blogTypeInfo.blogTypeName}">${blog.blogTypeInfo.blogTypeName}</a>, <a href="#">${blog.blogType}</a>
                                <a id="a_comment${blog.blogId}" class="com"></a>
                            </p>
                            <div width="605" height="500">
                                <img src="${blog.blogImage}" width="100%" height="100%" alt="image" />
                            </div>
                            <p><a href="https://github.com/KLkon" title="GitHub">我的空间</a></p>
                            <!--文章内容-->
                            <p style="display:none" class="arti_content${blog.blogId}" id='article_content${blog.blogId}'>${blog.blogContent}</p>
                            <script>
                                $(document).ready(function(){
                                    //点击查看文章滑动效果代码
                                    //通过文章ID来确认点击查看的是哪篇文章
                                    //如果不这么做会打开所有文章
                                    var display1 = "#display${blog.blogId}";
                                    var display_back1 = "#display_back${blog.blogId}";
                                    var arti_content1 = ".arti_content${blog.blogId}";
                                    $("#display${blog.blogId}, #display_back${blog.blogId}").click(function(){
                                        if(this.innerText == "点击查看文章"){
                                            $(display1).hide();
                                            $(display_back1).show();
                                            $(arti_content1).slideToggle(1000);
                                        }else{
                                            $(arti_content1).slideToggle(1000,function(){
                                                $(display_back1).hide();
                                                $(display1).show();
                                            });
                                        }
                                    });
                                });
                            </script>
                            <p class="display" id="display${blog.blogId}">点击查看文章</p>
                            <p class="display_back" id="display_back${blog.blogId}" style="display:none">点击收起文章</p>
                        </div>
                </c:if>
                <!--评论-->
                <div class="comments">
                    <div v-if="extend.blogComments !== null" v-for="(item,index) in extend.blogComments">
                        <!--已经评论的内容-->
                        <!--评论序号-->
                        <h3>评论序号:{{item.blogCommentId}}</h3>
                        <!--评论人名字-->
                        <span class="com_name">{{item.blogCommentUsername}}</span>
                        <!--评论时间-->
                        <span class="com_time">&nbsp;在&nbsp<font>{{getDate(item.blogCommentDate)}}</font>&nbsp;评论</span>
                        <p class="com_content">{{item.blogCommentContent}}</p>
                        <a :id="getReplyId(index)" @click="displayReply(getReplyId(index), getReplyResponseId(index), $event)">点击回复</a>
                        <!--回复评论-->
                        <div :class="getReplyResponseId(index)" style='display:none'>
                        <form action="/addComment" method='post' :id="getFormId(index)" @submit="submitValidate(errors, arguments, this)">
                            <h3>回复</h3>
                            <div>
                                <!--存放表单必传信息-->
                                <input type="hidden" name="blogForeignId" :value="item.blogForeignId" />
                                <input type="hidden" name="blogCommentTousername" :value="item.blogCommentUsername" />
                                <input type="hidden" name="blogForeignCommentid" :value="item.blogCommentId" />
                                <ol>
                                    <li>
                                        <label :for="getReplyNameId(index)">昵称</label>
                                        <div>
                                            <input v-validate="'required|blogCommentUsername'" :id="getReplyNameId(index)" name="blogCommentUsername" type="text"/>
                                        </div>
                                        <span v-show="errors.has('blogCommentUsername')"  :id="getReplyNameErrorId(index)" style='color:red'>{{ errors.first("blogCommentUsername")}}</span>
                                    </li>
                                    <li>
                                        <label :for="getReplyNameId(index)">回复内容</label>
                                        <div>
                                            <textarea v-validate="'required|blogCommentContent'" class="form-control" :id="getReplyNameId(index)" name="blogCommentContent" rows="8" cols="50" wrap="hard"></textarea>
                                        </div>
                                        <span v-show="errors.has('blogCommentContent')" :id="getReplyNameErrorId(index)" style='color:red'>{{ errors.first('blogCommentContent')}}</span>
                                    </li>
                                    <li>
                                        <label>验证码(60秒后过期)</label>
                                        <div>
                                            <img :id="getImageId(index)" src="/getCode">
                                            <a href ='javascript:void(0)' @click="changeCode('#'+ getImageId(index))">刷新</a>
                                            <br/>
                                            <input v-validate="'required|authcode'" type='text' name='authcode' id="getImputId(index)" placeholder="请输入验证码" />
                                        </div>
                                        <span v-show="errors.has('authcode')" id="getImageErrorId(index)" style='color:red'>{{ errors.first('authcode')}}</span>
                                    </li>
                                    <li>
                                        <input type="submit" class="btn btn-primary" name="signup" value="提交" />
                                    </li>
                                </ol>
                            </div>
                        </form>
                        </div>
                        <p>---------------------------------------------------------------------------------------------------------------------------------</p>
                    </div>
                </div>
                <br>
                <br>
                <!--回复博客-->
                <div class='respond' style='display:none'>
                    <form action='' method='post' id='submit'>
                        <h3>评论</h3>
                        <ol>
                            <li>
                                <label for="comments_name">昵称</label>
                                <input id="comments_name" name="blogCommentUsername" type="text"/>
                                <span  id='comments_name_error' style='color:red'></span>
                            </li>
                            <li>
                                <label for="comments_content">评论内容</label>
                                <textarea id="comments_content" name="comments_content" rows="8" cols="50" wrap="hard"></textarea>
                                <span id='comments_content_error' style='color:red'></span>
                            </li>
                            <li>
                                <label>验证码(60秒后过期)</label>
                                <img id="captcha_img" src="/getCode">
                                <a  href ='javascript:void(0)' onclick="changeImg()">刷新</a>
                                <br>请输入验证码<br>
                                <input type='text' name='authcode' id='authcode'><span id='authcode_error' style='color:red'></span>
                            </li>
                            <li>
                                <input type="image" name="imageField" id="imageField" src="resource/images/submit.gif" class="send" />
                                <div class="clr"></div>
                            </li>
                        </ol>
                    </form>
                </div>
            </div>
                <!-------------------------------------------------------------------------------------------->
            <div class="sidebar">
                <div class="searchform">
                    <form id="formsearch" name="formsearch" method="post" action="/searchSomething"><!--此处后台编写-->
                        <span id="select">
              <select name="searchSelect">
                <option value="blog">站内</option>
                <option value="baidu">百度</option>
              </select>
            </span>
                        <span><input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" placeholder="关键字搜索" type="text" /></span>
                        <input name="button_search" src="resource/images/search_btn.gif" class="button_search" type="image" />
                    </form>
                </div>
                <div class="gadget">
                    <!--天气预报-->
                    <iframe width="310px" scrolling="no" height="25px" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&a=getcode&id=40&h=25&w=310"></iframe>
                    <!--菜单栏-->
                    <h2 class="star">菜单栏</h2>
                    <div class="clr"></div>
                    <ul class="sb_menu">
                        <li><a href="https://poi.io/#/" target="_blank"></a></li>
                        <li><a href="#"></a></li>
                    </ul>
                    <!--日期-->
                    <iframe width="310px" height="174px" border=0 frameBorder=0  scrolling=no src="http://www.1t2t.com/1t/1.htm"></iframe>
                </div>
            </div>
            <div class="clr"></div>

        </div>
    </div>

    <div class="footer">
        <div class="footer_resize">
            <p class="lf">© Copyright <a href="#">我的空间</a>. Collect from <a href="https://github.com/KLkon" title="GitHub" target="_blank">我的空间</a></p>
            <ul class="fmenu">
                <li class="active"><a href="index.jsp">主页</a></li>
                <li><a href="support.html">支持</a></li>
                <li><a href="addArticle.html">博客</a></li>
                <li><a href="contact.html">联系我</a></li>
            </ul>
            <div class="clr"></div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(document).ready(function(){
        //使用vee-validate验证
        const config = {
            errorBagName: 'errors', // change if property conflicts.
            fieldsBagName: 'fields',
            delay: 0,
            locale: 'zh_CN',
            strict: true,
            enableAutoClasses: false,
            classNames: {
                touched: 'touched', // the control has been blurred
                untouched: 'untouched', // the control hasn't been blurred
                valid: 'valid', // model is valid
                invalid: 'invalid', // model is invalid
                pristine: 'pristine', // control has not been interacted with
                dirty: 'dirty' // control has been interacted with
            },
            events: 'blur|input',
            inject: true
        };
        //配置中文
        //一定要放在前面！！！！！！！
        VeeValidate.Validator.localize("zh_CN", {
            messages : {
                required : (name) => name + "不能为空"
            },
            //设置提示的名词
            attributes : {
                blogCommentUsername : "昵称",
                blogCommentContent : "评论内容",
                authcode : "验证码"
            }
        });
        //自定义规则
        //昵称
        VeeValidate.Validator.extend("blogCommentUsername", {
            getMessage: function () {
                return '请输入3-6位昵称';
            },
            validate: value => {
                //只含有汉字、数字、字母、下划线不能以下划线开头和结尾
                let reg = /^(?!_)(?!.*?_$)[a-zA-Z0-9_\u4e00-\u9fa5]{3,6}$/;
                return reg.test(value);
            }
        });
        //内容
        VeeValidate.Validator.extend("blogCommentContent", {
            getMessage: function () {
                return '至少6个字符';
            },
            validate: value => {
                //只含有汉字、数字、字母、下划线不能以下划线开头和结尾
                let reg = /^(?!_)(?!.*?_$)[a-zA-Z0-9_\u4e00-\u9fa5]{6,100}$/;
                return reg.test(value);
            }
        });
        //验证码
        VeeValidate.Validator.extend("authcode", {
            getMessage: function () {
                return "请输入正确验证码";
            },
            validate: value => {
                authcode = false;
                if(value.length == 4) {
                    $.ajax({
                        url:"/checkCode",
                        data:{'authcode':value},
                        type : "POST",
                        async : false,
                        success:function(data){
                            switch(data){
                                case 0:
                                    //$('#authcode_error').text('验证码过期');
                                    console.log("验证码过期")
                                    //changeImg();
                                    authcode = false;
                                    break;
                                case 1:
                                    authcode = true;
                                    break;
                                case 2:
                                    //$('#authcode_error').text('验证码错误');
                                    console.log("验证码错误")
                                    //changeCode('#'+ getImageId(index));
                                    authcode = false;
                                    break;
                            }
                        }
                    });
                }
                return authcode;
            }
        });


        //Vue对象加载VeeValidate验证组件
        Vue.use(VeeValidate, config);

        //加载评论
        getAllComments(${blog.blogId},".comments");
        //加载评论个数
        getRelCountComment(${blog.blogId}, "#a_comment${blog.blogId}");
    });
</script>
</body>
</html>

