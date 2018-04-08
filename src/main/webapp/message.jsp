<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>我的博客</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link href="resource/css/style.css" rel="stylesheet" type="text/css" />
    <link href="resource/images/blog.jpg" rel="icon" />
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
                    <a href="contact.html">发布留言</a>
                </div>
                <p class="pages">
                    <small>
                        Page 1of 5&nbsp;&nbsp;&nbsp;
                    </small>
                    <span>1</span>&nbsp<a href='/message.php?page=2'>2</a>&nbsp<a href='/message.php?page=3'>3</a>&nbsp<a href='/message.php?page=4'>4</a>&nbsp<a href='/message.php?page=5'>5</a>&nbsp&nbsp<a href='/message.php?page=2'>下一页</a>&nbsp<a href='/message.php?page=5'>末页</a> <a href='javascript:void(0)' class='jump'>跳转</a>
                </p>
                <div class='jump_page'>
                    <span class='jump_bar'><a href='javascript:void(0)'class='jump_close'>X</a></span>
                    <form action='/message.php' method='get' >
                        跳转到<input type='text' name='page'>页
                        <input type='image' src='/images/go_jump.png' title='跳转'>
                    </form>
                </div>

                <div class='message'>
                    <h3>#1</h3>
                    <div class='message_info'>
                        <a href='javascript:void(0)'><img src='/images/pix6.jpg' title='来自 湖南省长沙市'></a><br>
                        <span class='message_name'><a href='javascript:void(0)' style='font-weight:bold;font-size:15px;color:#49b6e9;    text-decoration: none;'>dasds</a></span><br>
                        <span class='message_time'>2018年03月11日 <br>12:52:59 pm</span>
                    </div>
                    <div class='pop'></div>
                    <div class='dashed'></div>
                    <p class='message_content'>dsadsa</p>
                    <div class='dianzan' id='dianzan0'>
                        <a href='javascript:void(0)' id='good0'>赞</a><br/>
                        <span id='gab_count0'>4</span><br/>
                        <a href='javascript:void(0)' id='bad0'>踩</a>
                    </div>
                </div>
                <script>
                    $(document).ready(function(){
                        $('#good0').click(function(){
                            $.ajax({
                                url:'controllers/good_and_bad.php',
                                data:{'good_and_bad':'good','message_id':"21"},
                                type : "POST",
                                async : true,
                                success:function(data){
                                    $('#gab_count0').text(data);


                                }
                            });
                        });

                        $('#bad0').click(function(){
                            $.ajax({
                                url:'controllers/good_and_bad.php',
                                data:{'good_and_bad':'bad','message_id':"21"},
                                type : "POST",
                                async : true,
                                success:function(data){
                                    $('#gab_count0').text(data);
                                }
                            });
                        });
                    });
                </script>

                <p class="pages">
                    <small>
                        Page 1of 5&nbsp;&nbsp;&nbsp;
                    </small>
                    <span>1</span>&nbsp<a href='/message.php?page=2'>2</a>&nbsp<a href='/message.php?page=3'>3</a>&nbsp<a href='/message.php?page=4'>4</a>&nbsp<a href='/message.php?page=5'>5</a>&nbsp&nbsp<a href='/message.php?page=2'>下一页</a>&nbsp<a href='/message.php?page=5'>末页</a> <a href='javascript:void(0)' class='jump'>跳转</a>
                </p>


            </div>

            <!-------------------------------------------------------------------------------------------->
            <div class="sidebar">
                <div class="searchform">
                    <form id="formsearch" name="formsearch" method="post" action="/searchSomeThing"><!--此处后台编写-->
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
                <p class="lf">© Copyright <a href="#">我的空间</a>. Collect from <a href="https://github.com/KLkon" title="GitHub" target="_blank">我的空间</a></p>            <ul class="fmenu">
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
