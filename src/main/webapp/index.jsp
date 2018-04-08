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
 <!-- <script>
      function stop(){
          return false;
      }
      document.oncontextmenu=stop;
  </script>-->
</head>
<body><!--oncontextmenu="return false" onselectstart="return false" 防止页面右击-->
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
        <!--页面初次加载博客-->
        <div class="article" v-if="extend.pageInfo !== null" v-for="(item,index) in extend.pageInfo.list">
          <p class="date">
              {{getMonth(item.blogSubmitDate)}}
              <span>{{getDate(item.blogSubmitDate)}}</span>
              {{getYear(item.blogSubmitDate)}}
          </p>
          <h2><span>{{item.blogArticleTitle}}</span></h2>
          <p class="subh2"></p>
          <p>
            发布者 <a :href="searchSomething(item.blogAuthor)">{{item.blogAuthor}}</a> &nbsp;|&nbsp;
            分类 <a :href="searchSomething(item.blogTypeInfo.blogTypeName)">{{item.blogTypeInfo.blogTypeName}}</a>
            <a :href="gotoComment(item.blogId)" class="com">评论</a>
            <button :id="getSpanId(index)" class="com" @click="relCountComment(item.blogId, getSpanId(index))">
              个数(点我)&nbsp;</button>
          </p>
          <div width="605" height="500">
            <img v-bind:src="item.blogImage" width="100%" height="100%" alt="image" />
          </div>
          <p><a href="https://github.com/KLkon" title="GitHub">我的空间</a></p>
          <!--文章内容-->
          <div  class="article_content"  :id="generateArtiId(index)" >{{item.blogContent}}</div>
          <div v-on:click="display(generateArtiId(index),generateDisId(index),generateDisBackId(index), $event)">
            <p class="display" v-bind:id="generateDisId(index)">点击查看文章</p>
            <p class="display_back" :id="generateDisBackId(index)" style="display:none">点击收起文章</p>
          </div>
        </div>
        <!-------------------------------------------------------------------------->
        <!-- 分页 -->
        <p class="pages">
            <small>Page {{extend.pageInfo.pageNum}} of {{extend.pageInfo.pages}} &nbsp;&nbsp;&nbsp;</small>
            <a v-if="extend.pageInfo.hasPreviousPage" :href="targetPage(extend.pageInfo.firstPage)">首页</a>
            <a v-if="extend.pageInfo.hasPreviousPage" :href="targetPage(extend.pageInfo.perPage)">&laquo;</a>
            <em v-for="page in extend.pageInfo.navigatepageNums" >
                <span v-if="extend.pageInfo.pageNum === page">{{page}}</span>
                <a v-else :href="targetPage(page)">{{page}}</a>
            </em>
            <a v-if="extend.pageInfo.hasNextPage" :href="targetPage(extend.pageInfo.nextPage)">&raquo;</a>
            <a v-if="extend.pageInfo.hasNextPage" :href="targetPage(extend.pageInfo.pages)">末页</a>
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
<script type="text/javascript">
    $(function () {
        to_page(1);
    });
</script>
<!--<noscript><iframe src="/*.html">;</iframe></noscript>-->
</body>
</html>
