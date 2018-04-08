<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="date" uri="http://datetag.tag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>我的博客</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link href="resource/css/style.css" rel="stylesheet" type="text/css" />
    <link href="resource/images/blog.jpg" rel="icon" />
    <script type="text/javascript" src="resource/js/jquery.min.js"></script>
    <script type="text/javascript" src="resource/js/common.js"></script>
    <script type="text/javascript" src="resource/js/vue.min.js"></script>
</head>
<body>
<div class="main">
    <div class="header">
        <div class="header_resize">
            <div class="logo">
                <h1 id="animate_logo">
                    <a href="#"><img src="resource/images/logo.jpg" width="48" height="50" alt="logo" /></a>
                    <a href="index.jsp">我的 <span>博客</span> <small>博客主页</small></a>
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

                <!--搜寻页面博客-->
                <c:if test="${pageInfo != null}">
                    <c:forEach var="blog" items="${pageInfo.list}">
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
                                <a id="a_comment${blog.blogId}" href="/getBlogComment?blogId=${blog.blogId}" class="com"></a>
                            </p>
                            <div width="605" height="500">
                                <img src="${blog.blogImage}" width="100%" height="100%" alt="image" />
                            </div>
                            <p><a href="https://github.com/KLkon" title="GitHub">我的空间</a></p>
                            <!--文章内容-->
                            <p style="display:none" class="arti_content${blog.blogId}" id='article_content${blog.blogId}'>${blog.blogContent}</p>
                            <script>
                                $(document).ready(function(){
                                    //加载评论个数
                                    getRelCountComment(${blog.blogId}, "#a_comment${blog.blogId}");
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
                    </c:forEach>
                </c:if>

                <!-------------------------------------------------------------------------->
                <!-- 分页 -->
                <p class="pages">
                    <small>Page ${pageInfo.pageNum} of ${pageInfo.pages} &nbsp;&nbsp;&nbsp;</small>
                    <c:if test="${pageInfo.hasPreviousPage}">
                    <a href="/searchSomething?pn=${pageInfo.firstPage}">首页</a>
                    </c:if>
                    <c:if test="${pageInfo.hasPreviousPage}">
                        <a href="/searchSomething?pn=${pageInfo.prePage}">&laquo;</a>
                    </c:if>
                    <c:forEach var="page" items="${pageInfo.navigatepageNums}">
                        <c:choose>
                            <c:when test="${pageInfo.pageNum == page}">
                                <span>${pageInfo.pageNum}</span>
                            </c:when>
                            <c:otherwise>
                                <a href="/searchSomething?pn=${page}">${page}</a>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage}">
                        <a href="/searchSomething?pn=${pageInfo.nextPage}">&raquo;</a>
                    </c:if>
                    <c:if test="${pageInfo.hasNextPage}">
                    <a href="/searchSomething?pn=${pageInfo.pages}">末页</a>
                    </c:if>
                </p>
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
</body>
</html>
