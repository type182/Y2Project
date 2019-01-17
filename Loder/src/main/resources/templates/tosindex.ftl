<html lang="zh-CN" class="root61 o2_wide csstransitions cssanimations o2_webkit o2_chrome o2_latest" ng-app="">
    <head>
        <meta charset="UTF-8">
        <title>MaiMai商场</title>
        <link rel="dns-prefetch" href="//static.360buyimg.com">
        <link rel="dns-prefetch" href="//misc.360buyimg.com">
        <link rel="dns-prefetch" href="//img10.360buyimg.com">
        <link rel="dns-prefetch" href="//img11.360buyimg.com">
        <link rel="dns-prefetch" href="//img12.360buyimg.com">
        <link rel="dns-prefetch" href="//img13.360buyimg.com">
        <link rel="dns-prefetch" href="//img14.360buyimg.com">
        <link rel="dns-prefetch" href="//img20.360buyimg.com">
        <link rel="dns-prefetch" href="//img30.360buyimg.com">
        <link rel="dns-prefetch" href="//d.3.cn">
        <link rel="dns-prefetch" href="//d.jd.com">
        <link rel="icon" href="#/favicon.ico" mce_href="#/favicon.ico" type="image/x-icon">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="renderer" content="webkit">
        <meta name="google-site-verification" content="4vmYcfLX0KWi82fvht-HAux15inXSVGVQ0tnUZqsdqE">
        <link charset="utf-8" rel="stylesheet" href="http://127.0.0.1:8001/css/index/index.css"></link>
        <script src="http://127.0.0.1:8001/js/angular.js"></script>
        <script src="http://127.0.0.1:8001/js/vue.js"></script>
        <script src="http://127.0.0.1:8001/js/jquery.js"></script>
        <script src="http://127.0.0.1:8001/js/recat.js"></script>
        <script src="http://127.0.0.1:8001/js/precat.js"></script>
        <link charset="utf-8" rel="stylesheet" href="http://127.0.0.1:8001/css/index/style.css"></link>
        <link charset="utf-8" rel="stylesheet" href="https://misc.360buyimg.com/mtd/pc/o2_toolbar/1.0.0/home/??main.min.css">
        <link charset="utf-8" rel="stylesheet" href="http://127.0.0.1:8001/css/index/boot.css"></link>
        <link charset="utf-8" rel="stylesheet" href="https://misc.360buyimg.com/jdf/1.0.0/ui/calendar/1.0.0/calendar.css"></link>
    </head>
    <body class="index" style="padding-bottom: 120px;">

        <div class="mod_container" id="app">
            <div id="shortcut">
                <div class="w">
                    <ul class="fl" clstag="h|keycount|head|topbar_01">
                        <li class="shortcut_btn dropdown" id="ttbar-mycity">
                            <div class="dt cw-icon ui-areamini-text-wrap" style=""><i class="iconfont"></i><span class="ui-areamini-text"
                                 data-id="1">
                                    <#if addres??>
                                        ${addres}
                                        <#else>
                                            未知地区
                                    </#if>
                                 </span>
                            </div>
                        </li>
                    </ul>
                    <ul class="fr">
                        <li id="ttbar-login" class="shortcut_btn fore1 dropdown" clstag="h|keycount|head|topbar_02"><a href="javascript:login();"
                             class="link-login">
                                <#if user??>
                                    ${user.name}
                                    <#else>
                                        你好，请登录
                                        </a>&nbsp;&nbsp;<a href="/toregister" class="link-regist style-red">免费注册</a>
                                        </li>
                                </#if>

                        <li class="spacer"></li>
                        <li class="shortcut_btn fore2" clstag="h|keycount|head|topbar_03">
                            <div class="dt"><a target="_blank" href="//order.jd.com/center/list.action">我的订单</a></div>
                        </li>
                        <li class="spacer"></li>


                        <li class="shortcut_btn fore5 dropdown shortcut_btn_company" clstag="h|keycount|head|topbar_06">
                            <div class="dt cw-icon"><a target="_blank" href="//b.jd.com/">企业采购</a><i class="iconfont"></i></div>
                            <div class="dd dropdown-layer">
                                <div class="dd-inner">
                                    <div class="item"><a href="//b.jd.com" target="_blank">企业购</a></div>
                                    <div class="item"><a href="//shang.jd.com" target="_blank">商用场景馆</a></div>
                                    <div class="item"><a href="//imall.jd.com" target="_blank">工业品</a></div>
                                    <div class="item"><a href="//o.jd.com" target="_blank">礼品卡</a></div>
                                </div>
                            </div>
                        </li>
                        <li class="spacer"></li>
                        <li id="ttbar-serv" class="shortcut_btn fore8 dropdown" clstag="h|keycount|head|topbar_07">
                            <div class="dt cw-icon">客户服务<i class="iconfont"></i></div>
                            <div class="dd dropdown-layer">
                                <div class="dd-inner"><span class="loading"></span></div>
                            </div>
                        </li>
                        <li class="spacer"></li>
                        <li id="ttbar-navs" class="shortcut_btn fore9 dropdown" clstag="h|keycount|head|topbar_08">
                            <div class="dt cw-icon">网站导航<i class="iconfont"></i></div>
                            <div class="dd dropdown-layer">
                                <dl class="fore1">
                                    <dt>特色主题</dt>
                                    <dd>
                                        <div class="item">
                                            <a href="链接" target="_blank" class="false">试用</a>
                                        </div>
                                        <div class="item">
                                            <a href="//jr.jd.com/" target="_blank" class="false">金融</a>
                                        </div>
                                    </dd>
                                </dl>
                            </div>
                        </li>

                    </ul>
                </div>
            </div>


            <div id="header">
                <div class="w">
                    <div id="logo" class="logo">
                        <h1 class="logo_tit">
                            <a href="#" class="logo_tit_lk" clstag="h|keycount|head|logo_01"></a>
                        </h1>
                        <h2 class="logo_subtit">MM,多快好省</h2>
                        <div class="logo_extend" clstag="h|keycount|head|logo_02" style="display: block;"><a id="J_logo_extend" href=""
                             style="display: block; width: 190px; height: 170px; background: #fff;" target="_blank" fclog="0.112344.483131.1.571_1816_8704"><img
                                 src="//img12.360buyimg.com/da/jfs/t27181/296/1669393067/112550/58c62782/5be96377N3763c9d4.gif"
                                 style="display: block; width: 190px; height: 170px;"></a>
                        </div>
                    </div>

                    <div id="search" class="search-fix">
                        <div class="search-m">
                            <div class="search_logo">
                                <a href="#" class="search_logo_lk" clstag="h|keycount|head|logo_01">，多快好省</a>
                            </div>
                            <ul id="shelper" style="display: none">

                            </ul>

                            <div class="form">
                                <div id="J_searchbg" class="search_bg">热门，搜索</div>
                                <input clstag="h|keycount|head|search_a" type="text"
                                 autocomplete="off" id="key" accesskey="s" class="text" style="background: transparent;"><span class="photo-search-btn">
                                    <form id="search-img-upload" clstag="h|keycount|2016|03d" method="post" action="//search.jd.com/image?op=upload"
                                     enctype="multipart/form-data" target="search_upload"><span class="upload-bg"></span><input type="file" name="file"
                                         class="upload-trigger" accept="image/png,image/jpeg,image/jpg"></form>
                                </span>
                                <button clstag="h|keycount|head|search_c" class="button"><i class="iconfont"></i></button>
                            </div>
                        </div>
                    </div>



                    <div id="settleup" class="dropdown" clstag="h|keycount|head|cart_null">
                        <div class="cw-icon">
                            <i class="ci-left"></i>
                            <i class="ci-right">&gt;</i><i class="ci-count" id="shopping-amount">0</i>
                            <i class="iconfont"></i>
                            <a target="_blank" href="//cart.jd.com/cart.action">我的购物车</a>
                        </div>
                        <div class="dropdown-layer">
                            <div id="J_cart_pop"><span class="loading"></span></div>
                        </div>
                    </div>

                    <div id="navitems">
                        <ul id="navitems-group1">
                            <li clstag="h|keycount|head|navi_01" class="fore1"><a target="_blank" href="#">秒杀</a></li>
                            <li clstag="h|keycount|head|navi_02" class="fore2"><a target="_blank" href="#">优惠券</a></li>
                        </ul>
                        <div class="spacer"></div>
                        <ul id="navitems-group2">
                            <li clstag="h|keycount|head|navi_06" class="fore2"><a target="_blank" href="#">时尚</a></li>
                            <li clstag="h|keycount|head|navi_07" class="fore3"><a target="_blank" href="#">超市</a></li>
                            <li clstag="h|keycount|head|navi_08" class="fore4"><a target="_blank" href="#">生鲜</a></li>
                        </ul>
                    </div>

                    <div id="treasure" clstag="h|keycount|head|adbtn_null"><a id="J_promo_lk" class="promo_lk" style="display: block; width: 190px; height: 40px; background: url(//img14.360buyimg.com/da/jfs/t30448/19/138529291/9192/13af184b/5be93950Nd687dc2c.png) center no-repeat;"
                         href="#" target="_blank" fclog="15629.112313.487180.1.571_1816_8703" clstag="h|keycount|head|adbtn_null"></a></div>
                </div>
            </div>

            <div class="fs">
                <div class="grid_c1 fs_inner">
                    <div class="fs_col1">
                        <div id="J_cate" class="cate J_cate cate18">
                            <ul class="JS_navCtn cate_menu">

                                    <#list menulist as men>
                                        <li class="cate_menu_item" >
                                            <a target="_blank" class="cate_menu_lk" href="${men.url}">${men.name}</a>
                                        </li>
                                    </#list>


                            </ul>
                            <div id="J_popCtn" class="JS_popCtn cate_pop mod_loading" style="display: none;"></div>
                        </div>
                    </div>

                    <div class="fs_col2">
                        <div id="J_focus" class="J_focus focus">
                            <div class="J_focus_main focus_main">
                                <div class="slider focus_list J_focus_list"><button class="slider_control slider_control_prev"><i class="iconfont"
                                         clstag="h|keycount|head|focus_sl"></i></button>
                                    <div class="slider_list" style="overflow: hidden;">
                                        <div class="slider_wrapper" style="opacity: 1; width: 5900px; transform: translate3d(0px, 0px, 0px); transition: none 0s ease 0s;">
                                                <#if wrapperlist??>
                                                    <#list wrap as wrapperlist>
                                                        <li class="slider_item focus_item slider_active"  style="float: left; position: relative; transition: opacity 500ms ease-in-out 0s; width: 590px; left: 0px; opacity: 1; z-index: 1;"><a
                                                            href="${wrap.url}" class="focus_item_lk" clstag="h|keycount|head|focus_01"
                                                            target="_blank"><i class="mod_actmark mod_actmark_focus"></i><img class="focus_item_img" src="${wrap.image}"></a>
                                                        </li>
                                                    </#list>
                                                </#if>
                                        </div>
                                    </div><button class="slider_control slider_control_next"><i class="iconfont" clstag="h|keycount|head|focus_sr"></i></button>
                                    <div class="slider_indicators" style="margin-left: -76px;">
                                        <i clstag="h|keycount|head|focus_s01" class="slider_indicators_btn slider_indicators_btn_active"></i>
                                        <i clstag="h|keycount|head|focus_s02" class="slider_indicators_btn"></i>
                                        <i clstag="h|keycount|head|focus_s03" class="slider_indicators_btn"></i>
                                        <i clstag="h|keycount|head|focus_s04" class="slider_indicators_btn"></i>
                                        <i clstag="h|keycount|head|focus_s05" class="slider_indicators_btn"></i>
                                        <i clstag="h|keycount|head|focus_s06"class="slider_indicators_btn"></i>
                                        <i clstag="h|keycount|head|focus_s07" class="slider_indicators_btn"></i>
                                        <i clstag="h|keycount|head|focus_s08" class="slider_indicators_btn slider_indicators_btn_last"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="fs_col3">
                        <div id="J_rec" class="J_rec rec">
                            <div class="rec_inner">
                                <#if topitem??>
                                    <#list item as topitem>
                                        <div class="rec_item"><a class="rec_lk mod_loading" href="${item.url}"
                                         target="_blank" clstag="h|keycount|head|recom_01">
                                            <div class="lazyimg lazyimg_loaded J_rec_img rec_img"><img src="${item.image}"
                                                 class="lazyimg_img"></div>
                                        </a></div>
                                    </#list>
                                </#if>
                            </div>
                        </div>
                    </div>
                    <div id="J_fs_col4" class="fs_col4">

                        <div id="J_user" class="J_user user">
                            <#if user??>
                                <div class="user_inner user_level1 user_plus0">
                                    <div class="J_user_avatar user_avatar"><a class="user_avatar_lk" href="#" target="_blank" clstag="h|keycount|head|login_01"><img
                                                 src="${user.user_head}"></a></div>
                                    <div class="user_show">
                                        <p class="user_tip">Hi~${user.user_name}</p>
                                    </div>
                                </div>
                                <#else>
                                    <div class="user_inner user_level1 user_plus0">
                                        <div class="J_user_avatar user_avatar"><a class="user_avatar_lk" href="//home.jd.com" target="_blank" clstag="h|keycount|head|login_01"><img
                                                 src="//misc.360buyimg.com/mtd/pc/common/img/no_login.jpg"></a></div>
                                        <div class="user_show">
                                            <p class="user_tip">Hi~欢迎来到MM  ！</p>
                                            <p><a href="toloder" class="user_login">登录</a>
                                            <a class="user_reg" href="Utoregister">注册</a></p>
                                        </div>
                                    </div>
                            </#if>
                        </div>
                        <div id="J_news" class="news J_news">
                            <div class="mod_tab news_tab J_news_tab" style="display: block;">
                                <div class="mod_tab_head J_tab_head clearfix">
                                    <a href="javascript:;" class="mod_tab_head_item news_first mod_tab_head_item_on" clstag="h|keycount|head|news_a">公告</a>
                                </div>
                                <div class="mod_tab_content J_tab_content">
                                    <div class="mod_tab_content_item mod_tab_content_item_on" style="display: block;">
                                        <ul class="news_list">
                                            <#if newsList??>
                                                <#list news as newsList>
                                                    <li class="news_item">
                                                        <a href="${news.url}" target="_blank" class="news_link" >${news.value}</a>
                                                    </li>
                                                </#list>
                                            </#if>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="J_fs_act" class="fs_act" style="position: absolute; height: 780px; left: 0px; top: 0px;"><a id="J_fs_act_lk"
                     class="fs_act_lk" href=""
                     target="_blank" style="display: block;  height: 770px; margin-top: 10px;"
                     clstag="h|keycount|head|adback_01" fclog="0.112316.482470.1.571_1816_8702"></a>
                </div>
            </div>
            <div class="floors">
                <div class="sk" id="J_seckill">
                    <div class="grid_c1 sk_inner">
                        <div class="sk_hd"><a class="sk_hd_lk" href="//miaosha.jd.com" target="_blank" clstag="h|keycount|core|seckill_a">
                                <div class="sk_tit">MM秒杀</div>
                                <div class="sk_subtit">FLASH DEALS</div><i class="sk_ico"></i>
                                <div class="sk_desc">本场距离结束还剩</div>
                                <div class="sk_cd">
                                    <div class="cd">
                                        <div class="cd_item cd_day"><span class="cd_item_txt">
                                            <#if spike??>
                                                ${spike.time.day}
                                            </#if>
                                        </span></div>
                                        <div class="cd_item cd_hour"><span class="cd_item_txt">
                                            <#if spike??>
                                                ${spike.time.day}
                                            </#if>
                                        </span></div>
                                        <div class="cd_item cd_minute"><span class="cd_item_txt">
                                            <#if spike??>
                                                ${spike.time.day}
                                            </#if>
                                        </span></div>
                                        <div class="cd_item cd_second"><span class="cd_item_txt">
                                            <#if spike??>
                                                ${spike.time.day}
                                            </#if>
                                        </span></div>
                                    </div>
                                </div>
                            </a>
                        </div>
                        <div class="sk_bd">
                            <div class="sk_list">
                                <div class="slider sk_list_inner"><button class="slider_control slider_control_prev"><i class="iconfont" clstag="h|keycount|core|seckill_sl"></i></button>
                                    <div class="slider_list" style="overflow: hidden;">
                                        <div class="slider_wrapper" style="opacity: 1; width: 5600px; transform: translate3d(-800px, 0px, 0px); transition: none 0s ease 0s;">
                                            <#if sliderItem??>
                                            <#list pro as sliderItem>
                                                <div class="slider_item sk_item sk_item_1 slider_active" style="float: left; width: 200px;">
                                                    <a  href="${pro.url}" target="_blank">
                                                        <div class="lazyimg lazyimg_loaded sk_item_img">
                                                            <img src="${pro.image}"class="lazyimg_img">
                                                        </div>
                                                        <p class="sk_item_name">${pro.name}</p>
                                                        <div class="sk_item_price">
                                                            <span class="mod_price sk_item_price_new">
                                                                <i>¥</i>
                                                                <span>${pro.price}</span>
                                                            </span>
                                                            <span class="mod_price sk_item_price_origin">
                                                                <i>¥</i>
                                                                <span>${pro.prices}</span>
                                                            </span>
                                                        </div>
                                                    </a>
                                                </div>
                                            </#list>
                                            </#if>
                                        </div>
                                    </div><button class="slider_control slider_control_next"><i class="iconfont" clstag="h|keycount|core|seckill_sr"></i></button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="enjoy">
                    <div class="enjoy_fix enjoy_fix_disabled">
                        <div style="display: none;">&nbsp;
                            <style>
                                .enjoy_fix_bg {
                                    width: 1270px;
                                    height: 80px;
                                    background-image: url(//img12.360buyimg.com/babel/s1270x80_jfs/t28618/46/142843816/63288/5b6e6cfe/5be93ab9Na96c3d77.png!q90!cc_1270x80)
                                }

                                .o2_mini .enjoy_fix_bg {
                                    width: 1057px;
                                    height: 66px;
                                    background-image: url(//img13.360buyimg.com/babel/s1057x66_jfs/t27631/100/1682976541/50487/e01f2c02/5be93abeN723a04fa.png!q90!cc_1057x66)
                                }
                            </style>
                        </div>
                        <div class="grid_c1 enjoy_fix_inner">
                            <div class="enjoy_fix_bg"></div>
                            <div class="enjoy_fix_tit"><a class="enjoy_fix_tit_lk" href="//sale.jd.com/act/HAnFTB1yv8VJ.html" target="_blank"
                                 clstag="h|keycount|sale|salebtn_d"></a></div>
                            <div class="enjoy_fix_list">
                                <ul class="enjoy_fix_list_inner">
                                    <li class="enjoy_fix_item"><a href="//sale.jd.com/act/0wd2v76CWM.html" class="enjoy_fix_item_lk J_log" target="_blank"
                                         clstag="h|keycount|sale|salebtn_d01">
                                            <div class="lazyimg lazyimg_loaded enjoy_fix_item_img"><img src="//img30.360buyimg.com/babel/s110x42_jfs/t30235/244/101562893/2843/97275b3e/5be80472N52c1ac04.png!q90!cc_110x42"
                                                 class="lazyimg_img"></div>
                                        </a></li>
                                    <li class="enjoy_fix_item"><a href="//sale.jd.com/act/fpgmdSRPst.html" class="enjoy_fix_item_lk J_log" target="_blank"
                                         clstag="h|keycount|sale|salebtn_d02">
                                            <div class="lazyimg lazyimg_loaded enjoy_fix_item_img"><img src="//img10.360buyimg.com/babel/s110x42_jfs/t29320/201/110499520/2789/480d00a/5be801d9Nf436a1d2.png!q90!cc_110x42"
                                                 class="lazyimg_img"></div>
                                        </a></li>
                                    <li class="enjoy_fix_item"><a href="//sale.jd.com/act/YCZDVi5Ac8rNksW.html" class="enjoy_fix_item_lk J_log"
                                         target="_blank" clstag="h|keycount|sale|salebtn_d03">
                                            <div class="lazyimg lazyimg_loaded enjoy_fix_item_img"><img src="//img10.360buyimg.com/babel/s110x42_jfs/t26344/350/1631400734/3141/2ee72817/5be801fcN37636f50.png!q90!cc_110x42"
                                                 class="lazyimg_img"></div>
                                        </a></li>
                                    <li class="enjoy_fix_item"><a href="//sale.jd.com/act/NiwXD0zMxW.html" class="enjoy_fix_item_lk J_log" target="_blank"
                                         clstag="h|keycount|sale|salebtn_d04">
                                            <div class="lazyimg lazyimg_loaded enjoy_fix_item_img"><img src="//img10.360buyimg.com/babel/s110x42_jfs/t29944/175/117184430/3027/14004369/5be801b5Neb637e08.png!q90!cc_110x42"
                                                 class="lazyimg_img"></div>
                                        </a></li>
                                    <li class="enjoy_fix_item"><a href="//sale.jd.com/act/KQTWqUaZzCv0Lf.html" class="enjoy_fix_item_lk J_log"
                                         target="_blank" clstag="h|keycount|sale|salebtn_d05">
                                            <div class="lazyimg lazyimg_loaded enjoy_fix_item_img"><img src="//img10.360buyimg.com/babel/s110x42_jfs/t29875/199/119065517/3208/9d5bddb6/5be801caNa035f889.png!q90!cc_110x42"
                                                 class="lazyimg_img"></div>
                                        </a></li>
                                    <li class="enjoy_fix_item"><a href="//sale.jd.com/act/VAbrYahXmp.html" class="enjoy_fix_item_lk J_log" target="_blank"
                                         clstag="h|keycount|sale|salebtn_d06">
                                            <div class="lazyimg lazyimg_loaded enjoy_fix_item_img"><img src="//img14.360buyimg.com/babel/s110x42_jfs/t25861/215/2040210277/2927/38b2332/5be8045cNd6de9c85.png!q90!cc_110x42"
                                                 class="lazyimg_img"></div>
                                        </a></li>
                                </ul>
                            </div>
                            <div class="enjoy_fix_close">
                                <div class="enjoy_fix_close_btn" clstag="h|keycount|sale|salebtn_g"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="J_corechn1" class="corechn1">
                    <div class="grid_c1 corechn1_inner">
                        <div id="J_top" class="box top">
                            <div class="box_hd"><a class="box_hd_lk" href="//top.jd.com" target="_blank" clstag="h|keycount|core|ranking_a">
                                    <h3 class="box_tit">排行榜</h3><i class="box_hd_arrow"></i><span class="box_subtit">专属你的购物指南</span>
                                </a></div>
                            <div class="box_bd">
                                <div class="top_inner">
                                    <div class="tab top_tab">
                                        <div class="tab_head">
                                            <#if tabhead??>
                                                <#list tabhead.title as he>
                                                    <div class="tab_head_item active"><a class="top_tab_lk" href"${he.url}" target="_blank">${he.name}</a>
                                                    </div>
                                                </#list>
                                            </#if>

                                        </div>
                                        <#if tabhead??>
                                        <#list tabhead.list as ls>
                                            <div class="tab_body">
                                                <div class="tab_body_item" style="">
                                                    <div class="slider top_wrapper">
                                                        <div class="slider_list" style="overflow: hidden;">
                                                            <div class="slider_wrapper" style="opacity: 1; width: 1400px; transform: translate3d(0px, 0px, 0px); transition: none 0s ease 0s;">
                                                                <div class="slider_item top_list slider_active" data-index="0" style="float: left; width: 350px;">
                                                                <#if tabhead.list[ls.inedx]??>
                                                                <#list tabhead.list[ls.index] as lisc>
                                                                        <div class="top_item"><a class="top_item_lk" href="${lisc.url}" target="_blank">
                                                                            <div class="lazyimg lazyimg_loaded top_item_img"><img src="${lisc.goods_set_the_recommended}"
                                                                                 class="lazyimg_img"></div>
                                                                                 <span class="top_item_rank top_item_rank_${lisc.index}">${lisc.index}</span><span class="top_item_name">${lisc.itemname}</span>
                                                                        </a></div>
                                                                </#list>
                                                                </#if>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="slider_indicators" style="margin-left: -17px;"><i clstag="h|keycount|core|ranking_s01" class="slider_indicators_btn slider_indicators_btn_active"></i><i
                                                             clstag="h|keycount|core|ranking_s02" class="slider_indicators_btn slider_indicators_btn_last"></i></div>
                                                    </div>
                                                </div>
                                            </div>
                                            </#list>
                                        </#if>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="J_daily" class="box daily">
                            <div id="J_goodrec" class="box chosen">
                            <div class="box_hd"><a class="box_hd_lk" href="//fxhh.jd.com/?linkIds=850160,952766,2119685,1771047" target="_blank"
                                 clstag="h|keycount|core|goods_a">
                                    <h3 class="box_tit">发现好货</h3><i class="box_hd_arrow"></i><span class="box_subtit">发现品质生活</span>
                                </a></div>
                            <div class="box_bd">
                                <div class="chosen_wrapper">
                                    <ul class="chosen_list clearfix">
                                        <#if clearfix??>
                                        <#list clearfix as cl>
                                             <li class="chosen_item"><a href="${cl.url}" class="chosen_item_lk"
                                                 target="_blank" clstag="h|keycount|core|goods_b01">
                                                    <div class="lazyimg lazyimg_loaded chosen_item_img"><img src="${cl.goods_resources}" class="lazyimg_img"></div><span class="chosen_item_tit">${cl.itemname}</span><span class="chosen_item_subtit">${cl.content}</span>
                                                </a></li>
                                        </#list>
                                        </#if>

                                    </ul>
                                </div>
                            </div>
                        </div>

                        </div>
                        <div id="J_coupon" class="box coupon box_last">
                            <div class="box_hd"><a class="box_hd_lk" href="//a.jd.com/" target="_blank" clstag="h|keycount|core|coupon_a">
                                    <h3 class="box_tit">领券中心</h3><i class="box_hd_arrow"></i><span class="box_subtit">前往领券中心</span>
                                </a></div>
                            <div class="box_bd">
                                <div class="coupon_inner">
                                    <div class="slider coupon_slider">
                                        <div class="slider_list" style="overflow: hidden;">
                                            <div class="slider_wrapper" style="opacity: 1; width: 1400px; transform: translate3d(-350px, 0px, 0px); transition: none 0s ease 0s;">
                                                <div class="slider_item coupon_list" data-index="-1" style="float: left; width: 350px;">
                                                    <#if couponlist??>
                                                    <#list couponlist as lis>
                                                             <div class="coupon_item"><a class="coupon_lk" href="//a.jd.com/?cateId=16" target="_blank" clstag="h|keycount|core|coupon_b05">
                                                                    <div class="lazyimg lazyimg_loaded coupon_img"><img src="//img12.360buyimg.com/babel/s70x70_jfs/t1/4733/1/11846/69717/5bd1289bE4040f10c/47fe5d1f17fa0418.jpg!q90!cc_70x70.webp"
                                                                         class="lazyimg_img"></div>
                                                                    <div class="coupon_more">
                                                                        <div class="coupon_more_inner">更多家用${lis.type}券</div>
                                                                    </div>
                                                                    <div class="coupon_info">
                                                                        <div class="mod_price coupon_price"><i>¥</i><span>${lis.reduction}</span></div>
                                                                        <div class="coupon_limit" >满${lis.reduction_conditions}元</div>
                                                                        <div class="coupon_desc" >${lis.name}</div>
                                                                    </div>
                                                                </a></div>
                                                            </div>
                                                    </#list>
                                                    </#if>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="slider_indicators" style="margin-left: -17px;"><i clstag="h|keycount|core|coupon_s01" class="slider_indicators_btn slider_indicators_btn_active"></i><i
                                             clstag="h|keycount|core|coupon_s02" class="slider_indicators_btn slider_indicators_btn_last"></i></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </div>
        		<#if itemtypelist??>
        		<#list itemtypelist as itlis>
                <div id="J_house" class="stage stage_4">
                    <div class="floorhd">
                        <div class="grid_c1 floorhd_inner">
                            <h3 class="floorhd_tit">${itlis.typename}</h3>
                        </div>
                    </div>
					
                    <div class="chn">
                        <div class="grid_c1 clearfix">
                             <#list itlis.onelist as onelist>
							 	<div class="box treasure">
	                             	<a class="treasure_scene" href="" target="_blank">
	                                    <div class="treasure_scene_hd">
	                                        <h4 class="treasure_scene_tit">${onelist.name1} · <span class="treasure_scene_subtit">${onelist.name2}</span></h4>
	                                    </div>
	                                    <div class="treasure_scene_bd">
	                                        <ul class="treasure_list">
	                                            <#list onelist.listitem as item>
		                                            <li class="treasure_item">
		                                                <div class="lazyimg lazyimg_loaded treasure_img">
		                                                	<img src="${item.images}" class="lazyimg_img">
		                                                </div>
		                                            </li>
	                                            </#list>
	                                        </ul>
	                                    </div>
	                                    <div class="treasure_scene_gap"></div>
	                                 </a>
	                              </div>
							 </#list>
							 <#list itlistolist as to>
                            <div class="box sort">
                                <div class="box_hd"><a class="box_hd_lk" href="//jiadian.jd.com/" target="_blank" clstag="h|keycount|house|chan#02_a">
                                        <h3 class="box_tit">${to.name}</h3><i class="box_hd_arrow"></i><span class="box_subtit">家电好物节</span>
                                    </a></div>
                                <div class="box_bd">
                                    <div class="sort_wrapper clearfix">
                                    	<a class="sort_large" href="" target="_blank">
                                            <div class="lazyimg lazyimg_loaded sort_large_img">
                                            	<img src="${to.titleimage}" class="lazyimg_img">
                                            </div>
                                        </a>
                                        <#list to.list as list>
                                        	<a class="sort_middle" href="${list.url}" target="_blank" title="个护电器" clstag="h|keycount|house|chan#02_c02">
                                            	<div class="lazyimg lazyimg_loaded sort_middle_img">
                                            		<img src="${list.images}"
                                                 	class="lazyimg_img"></div>
                                        	</a>
                                        </#list>
                                     </div>
                               </div>
                                </#list>
                            </div>
                        </div>
                        </#list>
                       </#if>
                    </div>
                </div>
            </div>
        </div>


<div class="more2" id="J_more">
    <div class="floorhd">
        <div class="grid_c1 floorhd_inner">
            <h3 class="floorhd_tit">还没逛够</h3>
        </div>
    </div>
    <div class="grid_c1 more2_inner">
        <ul class="more2_list clearfix">
               <!-- AJAX 请求异步获取 --> 

        </ul>
            
        </div>
    </div>








        <div id="J-global-toolbar">
            <div class="jdm-toolbar-wrap J-wrap">
                <div class="jdm-toolbar J-toolbar">
                    <div class="jdm-toolbar-panels J-panel">
                        <div data-name="ad" class="J-content jdm-toolbar-panel jdm-tbar-panel-ad" data-iframe="//c-nfa.jd.com/adclick?keyStr=6PQwtwh0f06syGHwQVvROzh5ulIgMw7+jmnFGWIVTm5/xRefgrPsUusTvAnpEf+CNnzzQay5libreghlkCNqf0mQDZtPXLbZ1R3K3urT0QHbcCkUfL9k0cGw40hol+sIxDAsgCu+qgXFEMoZckExJXcJ01YAjp62oA7i/YRfGZytsv0PATkq2VLKz1OYEoZHPg/5lcwJ9ODRALR4zzW6KndBYMCVFxlbZRUKij7Z92358nvVR6ukal9j8UOUAB7XX2eOVm6BWJgL+STwEf7TGxhRUJO1SzbN9ghEGFXB7f90eAcCcxt4/aYpXclWi6Ay4kZYtET9oANOMTk0wDstKw==&amp;cv=2.0&amp;url=https://sale.jd.com/act/L3MvZNh486xjm1s.html">
                            <h3 class="jdm-tbar-panel-header J-panel-header"> <a> <i></i> <em class="title">11.11全球好物节</em> </a> <span
                                 class="close-panel J-close"></span> </h3>
                            <div class="jdm-tbar-panel-main">
                                <div class="jdm-tbar-panel-content J-panel-content"> </div>
                            </div>
                        </div>
                        <div data-name="jdvip" class="J-content jdm-toolbar-panel jdm-tbar-panel-jdvip">
                            <h3 class="jdm-tbar-panel-header J-panel-header"> <span class="title" clstag="h|keycount|cebianlan_h_jdvip|title">
                                    <i></i> <em class="title">会员</em> </span> <span class="close-panel J-close"></span> </h3>
                            <div class="jdm-tbar-panel-main">
                                <div class="jdm-tbar-panel-content J-panel-content" style="overflow:hidden;">
                                    <div class="jdm-tbar-tipbox2">
                                        <div class="tip-inner"> <i class="i-loading"></i> </div>
                                    </div>
                                </div>
                            </div>
                            <div class="jdm-tbar-panel-footer J-panel-footer"></div>
                        </div>
                        <div data-name="cart" class="J-content jdm-toolbar-panel jdm-tbar-panel-cart">
                            <h3 class="jdm-tbar-panel-header J-panel-header"> <a href="//cart.jd.com/cart.action?r=0.4700307289027068"
                                 target="_blank" class="title" clstag="h|keycount|cebianlan_h_cart|title"> <i></i> <em class="title">购物车</em>
                                </a> <span class="close-panel J-close"></span> </h3>
                            <div class="jdm-tbar-panel-main">
                                <div class="jdm-tbar-panel-content J-panel-content">
                                    <div class="jdm-tbar-tipbox2">
                                        <div class="tip-inner"> <i class="i-loading"></i> </div>
                                    </div>
                                </div>
                            </div>
                            <div class="jdm-tbar-panel-footer J-panel-footer"></div>
                        </div>
                        <div data-name="follow" class="J-content jdm-toolbar-panel jdm-tbar-panel-follow">
                            <h3 class="jdm-tbar-panel-header J-panel-header"> <a href="//t.jd.com/home/follow" target="_blank" class="title"
                                 clstag="h|keycount|cebianlan_h_follow|title"> <i></i> <em class="title">我的关注</em> </a> <span class="close-panel J-close"></span>
                            </h3>
                            <div class="jdm-tbar-panel-main">
                                <div class="jdm-tbar-panel-content J-panel-content">
                                    <div class="jdm-tbar-tipbox2">
                                        <div class="tip-inner"> <i class="i-loading"></i> </div>
                                    </div>
                                </div>
                            </div>
                            <div class="jdm-tbar-panel-footer J-panel-footer"></div>
                        </div>
                        <div data-name="history" class="J-content jdm-toolbar-panel jdm-tbar-panel-history">
                            <h3 class="jdm-tbar-panel-header J-panel-header"> <a href="//my.jd.com/history/list.html" target="_blank" class="title"
                                 clstag="h|keycount|cebianlan_h_history|title"> <i></i> <em class="title">我的足迹</em> </a> <span class="close-panel J-close"></span>
                            </h3>
                            <div class="jdm-tbar-panel-main">
                                <div class="jdm-tbar-panel-content J-panel-content">
                                    <div class="jdm-tbar-tipbox2">
                                        <div class="tip-inner"> <i class="i-loading"></i> </div>
                                    </div>
                                </div>
                            </div>
                            <div class="jdm-tbar-panel-footer J-panel-footer"></div>
                        </div>
                        <div data-name="jimi" class="J-content jdm-toolbar-panel jdm-tbar-panel-jimi">
                            <h3 class="jdm-tbar-panel-header J-panel-header"> <span class="title" clstag="h|keycount|cebianlan_h_jimi|title">
                                    <i></i> <em class="title">咨询JIMI</em> </span> <span class="close-panel J-close"></span> </h3>
                            <div class="jdm-tbar-panel-main">
                                <div class="jdm-tbar-panel-content J-panel-content" style="overflow:hidden;">
                                    <div class="jdm-tbar-tipbox2">
                                        <div class="tip-inner"> <i class="i-loading"></i> </div>
                                    </div>
                                </div>
                            </div>
                            <div class="jdm-tbar-panel-footer J-panel-footer"></div>
                        </div>
                    </div>
                    <div class="jdm-toolbar-header" style="width: 0px;">
                        <div class="jdm-tbar-act J-trigger" data-type="bar" data-name="ad" data-iframe="true" clstag="h|keycount|sale|saleicon|e"
                         style="width: 0px; height: 0px; background: url(&quot;//img14.360buyimg.com/da/jfs/t1/5300/36/10621/4422/5bccb496Ebd8585e0/9b905a42e0cd3e4e.png&quot;) no-repeat; cursor: pointer;">
                        </div>
                    </div>
                    <div class="jdm-toolbar-tabs J-tab">
                        <div data-type="bar" clstag="h|keycount|cebianlan_h_jdvip|btn" class="J-trigger jdm-toolbar-tab jdm-tbar-tab-jdvip"
                         data-name="jdvip" data-login="true" data-iframe="//vip.jd.com/sideBar/index.html"> <i class="tab-tip"></i> <i
                             class="tab-ico"></i> <em class="tab-text"> 会员 </em> <span class="tab-sub J-count hide">0</span>
                            <div class="tabs-tip hide"> <span class="ico"></span> <span class="text">成功加入购物车!</span> <b></b> </div>
                        </div>
                        <div data-type="bar" clstag="h|keycount|cebianlan_h_cart|btn" class="J-trigger jdm-toolbar-tab jdm-tbar-tab-cart"
                         data-name="cart"> <i class="tab-ico"></i> <em class="tab-text"> 购物车 </em> <span class="tab-sub J-count hide"
                             style="display: none;">0</span>
                            <div class="tabs-tip hide"> <span class="ico"></span> <span class="text">成功加入购物车!</span> <b></b> </div>
                        </div>
                        <div data-type="bar" clstag="h|keycount|cebianlan_h_follow|btn" class="J-trigger jdm-toolbar-tab jdm-tbar-tab-follow"
                         data-name="follow" data-login="true"> <i class="tab-ico"></i> <em class="tab-text"> 我的关注 </em> <span class="tab-sub J-count hide">0</span>
                            <div class="tabs-tip hide"> <span class="ico"></span> <span class="text">成功加入购物车!</span> <b></b> </div>
                        </div>
                        <div data-type="bar" clstag="h|keycount|cebianlan_h_history|btn" class="J-trigger jdm-toolbar-tab jdm-tbar-tab-history"
                         data-name="history"> <i class="tab-ico"></i> <em class="tab-text"> 我的足迹 </em> <span class="tab-sub J-count hide">0</span>
                            <div class="tabs-tip hide"> <span class="ico"></span> <span class="text">成功加入购物车!</span> <b></b> </div>
                        </div>
                        <div clstag="h|keycount|cebianlan_h_message|btn" class="J-trigger jdm-toolbar-tab jdm-tbar-tab-message" data-name="message"><a
                             target="_blank" href="//joycenter.jd.com/msgCenter/queryHistoryMessage.action"> <i class="tab-ico"></i> <em
                                 class="tab-text"> 我的消息 </em> </a> <span class="tab-sub J-count hide">0</span>
                            <div class="tabs-tip hide"> <span class="ico"></span> <span class="text">成功加入购物车!</span> <b></b> </div>
                        </div>
                        <div data-type="bar" clstag="h|keycount|cebianlan_h_jimi|btn" class="J-trigger jdm-toolbar-tab jdm-tbar-tab-jimi"
                         data-name="jimi" data-login="true" data-iframe="//jimi.jd.com/index.action?source=jdhome"> <i class="tab-ico"></i>
                            <em class="tab-text"> 咨询JIMI </em> <span class="tab-sub J-count hide">0</span>
                            <div class="tabs-tip hide"> <span class="ico"></span> <span class="text">成功加入购物车!</span> <b></b> </div>
                        </div>
                        <div data-type="link" class="J-trigger jdm-toolbar-tab jdm-tbar-tab-feedback"> <a href="//surveys.jd.com/index.php?r=survey/index/sid/889711/newtest/Y/lang/zh-Hans"
                             target="_blank" clstag="h|keycount|cebianlan_h|feedback"> <i class="tab-ico"></i> <em class="tab-text">反馈</em>
                            </a> </div>
                    </div>
                    <div class="jdm-toolbar-footer">
                        <div data-type="link" class="J-trigger jdm-toolbar-tab jdm-tbar-tab-top"> <a href="#" clstag="h|keycount|cebianlan_h|top">
                                <i class="tab-ico"></i> <em class="tab-text">顶部</em> </a> </div>
                    </div>
                    <div class="jdm-toolbar-mini"> </div>
                </div>
            </div>
        </div>
    </body>
</html>
