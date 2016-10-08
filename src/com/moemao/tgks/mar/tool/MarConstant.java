package com.moemao.tgks.mar.tool;


public class MarConstant
{
    public static final String MODULE_TAG = "MARZ";
    
    public static final String KRSMA_SPLIT = "=";
    
    public static final String LOG_SYSTEM_INFO = "[ System Info ] ";
    
    public static final String INITIAL_NAME = "Asuna";
    
    public static final String INITIAL_CHARA = "3";

    public static final String GACHA_ID_TEN = "20000300";
    
    public static final String GACHA_PAYTYPE = "3";
    
    public static final int SLEEP_TIME_GACHA = 500;
    
    public static final int SLEEP_TIME_BATTLE = 30000;
    
    public static final String ITEM_ID_BP_RECOVER_FULL = "1000";
    
    public static final String ITEM_ID_BP_RECOVER_HALF = "1001";
    
    public static final String ITEM_ID_BP_RECOVER_30 = "1002";
    
    public static final String ITEM_ID_BP_RECOVER_FULL_SUNDAY = "1100";

    public static final String ITEM_ID_KEY_CHIARI = "3000";
    
    public static final String ITEM_ID_KEY_BOSS = "3001";
    
    public static final String ITEM_ID_KEY_KIRARI = "3002";
    
    // 0 普通本；2 材料本；9 单BOSS本；10 SOLO本
    public static final String STAGE_TYPE_0 = "0";
    public static final String STAGE_TYPE_2 = "2";
    public static final String STAGE_TYPE_9 = "9";
    public static final String STAGE_TYPE_10 = "10";
    
    /**
     * 未使用
     */
    public static final String PASSWORDCARD_STATUS_0 = "0";
    /**
     * 使用中
     */
    public static final String PASSWORDCARD_STATUS_1 = "1";
    /**
     * 已使用
     */
    public static final String PASSWORDCARD_STATUS_2 = "2";
    
    /**
     * 新建
     */
    public static final String ACCOUNT_STATUS_0 = "0";
    /**
     * 执行中
     */
    public static final String ACCOUNT_STATUS_1 = "1";
    /**
     * 已完成
     */
    public static final String ACCOUNT_STATUS_2 = "2";
    /**
     * 已售出
     */
    public static final String ACCOUNT_STATUS_3 = "3";
    /**
     * 招待预备
     */
    public static final String ACCOUNT_STATUS_4 = "4";
    /**
     * 招待完成
     */
    public static final String ACCOUNT_STATUS_5 = "5";
    /**
     * 自用测试
     */
    public static final String ACCOUNT_STATUS_9 = "9";

    /**
     * KRSMA卡片职业 佣兵
     */
    public static final String KRSMACARD_TYPE_1 = "1";
    /**
     * KRSMA卡片职业 富豪
     */
    public static final String KRSMACARD_TYPE_2 = "2";
    /**
     * KRSMA卡片职业 盗贼
     */
    public static final String KRSMACARD_TYPE_3 = "3";
    /**
     * KRSMA卡片职业 歌姬
     */
    public static final String KRSMACARD_TYPE_4 = "4";
    /**
     * KRSMA是否自动卖卡 否
     */
    public static final String KRSMACARD_SELLFLAG_0 = "0";
    /**
     * KRSMA是否自动卖卡 是
     */
    public static final String KRSMACARD_SELLFLAG_1 = "1";
    /**
     * KRSMA是否自动合成名声 否
     */
    public static final String KRSMACARD_FAMEFLAG_0 = "0";
    /**
     * KRSMA是否自动合成名声 是
     */
    public static final String KRSMACARD_FAMEFLAG_1 = "1";

    public static final String URL_PRE_HTTPS = "https://app.login.kairisei-ma.jp:443";
    public static final String URL_PRE = "http://app.kairisei-ma.jp";
    
    /**
     * 身份认证
     */
    public static final String URL_AUTH_CHECK = URL_PRE_HTTPS + "/Auth2/auth_check.php";
    
    /**
     * 注册
     */
    public static final String URL_REGIST = URL_PRE_HTTPS + "/Auth2/login.php";

    /**
     * 登录
     */
    public static final String URL_LOGIN = URL_PRE_HTTPS + "/Auth2/login.php";

    /**
     * 连接
     */
    public static final String URL_CONNECT = URL_PRE + "/Game/Connect";

    /**
     * 选职起名
     */
    public static final String URL_USERCREATE = URL_PRE + "/Game/UserCreate";

    /**
     * 主界面
     */
    public static final String URL_HOMESHOW = URL_PRE + "/Game/HomeShow";
    
    /**
     * 物品信息
     */
    public static final String URL_ITEMSHOW = URL_PRE + "/Game/ItemShow";
    
    /**
     * 物品使用
     */
    public static final String URL_ITEMUSE = URL_PRE + "/Game/ItemUse";
    
    /**
     * 物品购买
     */
    public static final String URL_ITEMSHOPBUY = URL_PRE + "/Game/ItemShopBuy";

    /**
     * 输入招待号
     */
    public static final String URL_INVITECODEENTER = URL_PRE + "/Game/InviteCodeEnter";
    
    /**
     * 礼物箱信息
     */
    public static final String URL_PRESENTBOXSHOW = URL_PRE + "/Game/PresentBoxShow";
    
    /**
     * 单个礼物收取
     */
    public static final String URL_PRESENTBOXRECV = URL_PRE + "/Game/PresentBoxRecv";
    
    /**
     * 批量收取礼物
     */
    public static final String URL_PRESENTBOXMULTIRECV = URL_PRE + "/Game/PresentBoxMultiRecv";
    
    /**
     * 抽卡准备
     */
    public static final String URL_GACHASHOW= URL_PRE + "/Game/GachaShow";
    
    /**
     * 抽卡
     */
    public static final String URL_GACHAPLAY = URL_PRE + "/Game/GachaPlay";

    /**
     * 卡组信息
     */
    public static final String URL_CARDSHOW = URL_PRE + "/Game/CardShow";

    /**
     * 卡组信息 新
     */
    public static final String URL_CARDSHOW2 = URL_PRE + "/Game/CardShow2";

    /**
     * 卡片合成
     */
    public static final String URL_CARDFUSION = URL_PRE + "/Game/CardFusion2";

    /**
     * 卡组配置
     */
    public static final String URL_CARDDECKSET = URL_PRE + "/Game/CardDeckSet";
    
    /**
     * 卡片出售
     */
    public static final String URL_CARDSELL = URL_PRE + "/Game/CardSell";

    /**
     * 战斗信息 单人
     */
    public static final String URL_TEAMBATTLESOLOSHOW = URL_PRE + "/Game/TeamBattleSoloShow";

    /**
     * 战斗信息 单人选择其他职业信息
     */
    public static final String URL_TEAMBATTLESOLOPARTNERSHOW = URL_PRE + "/Game/TeamBattleSoloPartnerShow";

    /**
     * 战斗开始 单人
     */
    public static final String URL_TEAMBATTLESOLOSTART = URL_PRE + "/Game/TeamBattleSoloStart";

    /**
     * 战斗结束 单人
     */
    public static final String URL_TEAMBATTLESOLOEND = URL_PRE + "/Game/TeamBattleSoloEnd";
    
    /**
     * 钥匙副本 开门
     */
    public static final String URL_USERBUFFEXEC = URL_PRE + "/Game/UserBuffExec";
    
    /**
     * 探索 开始
     */
    public static final String URL_EXPLORESTART = URL_PRE + "/Game/ExploreStart";
    
    /**
     * 探索 结束
     */
    public static final String URL_EXPLOREEND = URL_PRE + "/Game/ExploreEnd";
    
    /**
     * 查看PVP信息
     */
    public static final String URL_PVPSHOW = URL_PRE + "/Game/PvpShow";
    
    /**
     * PVP开始
     */
    public static final String URL_PVPSTART = URL_PRE + "/Game/PvpStart";
    
    /**
     * PVP结束
     */
    public static final String URL_PVPEND = URL_PRE + "/Game/PvpEnd";
    
    /**
     * 查看任务详情
     */
    public static final String URL_MISSIONSHOW = URL_PRE + "/Game/MissionShow";
    
    /**
     * 收取任务奖励
     */
    public static final String URL_MISSIONREWARD = URL_PRE + "/Game/MissionReward";
    
    /**
     * 初始地图
     */
    public static final String BATTLESOLOSTART_FIRST = "10000101";
    public static final String BATTLESOLOSTART_17_3 = "10001703";
    public static final String BATTLESOLOSTART_18_1 = "10001801";
    
    public static final String BATTLE_START_CHIARI = "20000002";
    public static final String BATTLE_START_CHIARI_GW = "20000802";

    public static final String BOSSID_HEAD_PROCESS3_CHIARI = "2000000";
    public static final String BOSSID_HEAD_PROCESS3_DAILY = "2100";
    public static final String BOSSID_HEAD_PROCESS3_CHIARI_KEY = "8200";
    public static final String BOSSID_HEAD_PROCESS3_DAILY_KEY = "8490";
    public static final String BOSSID_HEAD_PROCESS1_DRAGON_KEY = "830";
    public static final String BOSSID_HEAD_PROCESS1_EVENT_KEY = "840";
    
    public static final String BOSSID_HEAD_PROCESS1_SOLO_KEY = "490";

    public static final String BATTLE_START_MONDAY = "21005003";
    public static final String BATTLE_START_TUESDAY = "21001003";
    public static final String BATTLE_START_WEDNESDAY = "21002003";
    public static final String BATTLE_START_THURSDAY = "21003003";
    public static final String BATTLE_START_FRIDAY = "21004003";
    public static final String BATTLE_START_SATURDAY = "21001103";
    public static final String BATTLE_START_SUNDAY = "21004113";
    
    public static final String BATTLESOLOEND_3 = "{\"progress\":3,\"is_clear\":1,\"input_cmd\":[\"40967,12,1,-1094478231\\n40967,13,1,1688423108,-307924438,-1109076503,-98282593,1363694209,702014236,1530950256,-1479841701,1882375902,339297594\\n40967,12,2,-2123006695\\n40967,13,2,1858030861,1609098183,111631633,1702686679,-1667121605,-14857794,-1145761117,-589054781,1152635910,927187480\\n40967,12,3,987772800\\n40967,13,3,-1198360069,1289591036,-2108788831,-1058316615,-1115372015,358882571,330731556,40545635,2125183240,-2111758011\\n40967,12,4,-720601786\\n40967,13,4,1215020716,189195468,1300725195,-1638505336,-580282773,-228619101,1454281141,-1287719137,-1548365682,-642815099\\n40967,14,5,-124786120,-689087767\\n40967,14,6,-124786120,-689087767\\n40967,14,7,-124786120,-689087767\\n40967,14,8,-1136481224,1602949194\\n40967,15,-117239005\\n40967,10\\n40967,0\\n40967,3,4\\n40967,3,3\\n40967,3,2\\n40967,3,1\\n40967,6\\n40967,1\\n40297,10\\n40297,0\\n40297,3,4\\n40297,3,3\\n40297,3,2\\n40297,3,1\\n40297,6\\n\",\"40297,12,1,-1094478231\\n40297,13,1,1688423108,-307924438,-1109076503,-98282593,1363694209,702014236,1530950256,-1479841701,1882375902,339297594\\n40297,12,2,-2123006695\\n40297,13,2,1858030861,1609098183,111631633,1702686679,-1667121605,-14857794,-1145761117,-589054781,1152635910,927187480\\n40297,12,3,987772800\\n40297,13,3,-1198360069,1289591036,-2108788831,-1058316615,-1115372015,358882571,330731556,40545635,2125183240,-2111758011\\n40297,12,4,-720601786\\n40297,13,4,1215020716,189195468,1300725195,-1638505336,-580282773,-228619101,1454281141,-1287719137,-1548365682,-642815099\\n40297,14,5,-124786120,-689087767\\n40297,14,6,-124786120,-689087767\\n40297,14,7,-124786120,-689087767\\n40297,14,8,-1136481224,1602949194\\n40297,15,-117239005\\n40297,10\\n40297,0\\n40297,3,4\\n40297,3,3\\n40297,3,2\\n40297,3,1\\n40297,6\\n40297,1\\n38957,10\\n38957,0\\n38957,3,4\\n38957,3,3\\n38957,3,2\\n38957,3,1\\n38957,6\\n\",\"38957,12,1,-1094478231\\n38957,13,1,1688423108,-307924438,-1109076503,-98282593,1363694209,702014236,1530950256,-1479841701,1882375902,339297594\\n38957,12,2,-2123006695\\n38957,13,2,1858030861,1609098183,111631633,1702686679,-1667121605,-14857794,-1145761117,-589054781,1152635910,927187480\\n38957,12,3,987772800\\n38957,13,3,-1198360069,1289591036,-2108788831,-1058316615,-1115372015,358882571,330731556,40545635,2125183240,-2111758011\\n38957,12,4,-720601786\\n38957,13,4,1215020716,189195468,1300725195,-1638505336,-580282773,-228619101,1454281141,-1287719137,-1548365682,-642815099\\n38957,14,5,-2094684080,-689087767\\n38957,14,6,-2094684080,-689087767\\n38957,14,7,-1136481224,1602949194\\n38957,14,8,-1136481224,1602949194\\n38957,15,-117239005\\n38957,10\\n38957,0\\n38957,3,4\\n38957,3,3\\n38957,3,2\\n38957,3,1\\n38957,6\\n38957,1\\n37437,10\\n37437,0\\n37437,3,4\\n37437,3,3\\n37437,3,2\\n37437,3,1\\n37437,6\\n\"],\"enemy_dead_bit\":[7,7,7],\"bossid\":";
    public static final String BATTLESOLOEND_2 = "{\"progress\":2,\"is_clear\":1,\"input_cmd\":[\"111054,22,1\\n111054,12,1,2132532550\\n111054,13,1,389097814,-678598811,-1573232971,-713327747,-1135871617,279587119,1028026319,-375734125,-821896048,-35459810\\n111054,24,1,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n111054,21,1,0,0,0\\n111054,12,2,-420982355\\n111054,13,2,-157106595,-1924286789,-362860954,-1507792970,130637544,-2070650263,-1865856204,943673401,-1354592605,-1364033292\\n111054,24,2,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n111054,21,2,0,0,0\\n111054,12,3,1040695652\\n111054,13,3,-2051066971,1665070997,10335235,-1043375603,-384116279,-452337012,196889099,384637727,-1565897730,204794780\\n111054,24,3,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n111054,21,3,0,0,0\\n111054,12,4,-2038425266\\n111054,13,4,-260424037,-836688812,-713597536,399409907,1425857511,1162428459,-1434812818,1485418424,1012061088,-916911544\\n111054,24,4,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n111054,21,4,0,0,0\\n111054,14,5,-2102065761\\n111054,16,5,964056133,1471632863,928343954,964056133,964056133,964056133,964056133,964056133,964056133,964056133\\n111054,17,5,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133\\n111054,14,6,118120125\\n111054,16,6,964056133,1122883751,-1553732638,964056133,964056133,964056133,964056133,964056133,964056133,964056133\\n111054,17,6,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133\\n111054,14,7,176278645\\n111054,16,7,964056133,1187243799,-1074353863,1332308350,964056133,964056133,964056133,964056133,964056133,964056133\\n111054,17,7,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133\\n111054,15,-988227918\\n111054,10\\n111054,0\\n111054,2,1,8,0,0,0,0,1,0,0,0,0,0,0\\n111054,2,2,2,0,0,0,0,5,0,0,0,0,0,0\\n111054,2,3,10,0,0,0,0,1,0,0,0,0,0,0\\n111054,2,4,2,0,0,0,0,2,0,0,0,0,0,0\\n111054,6\\n\",\"111054,22,1\\n111054,12,1,2132532550\\n111054,13,1,389097814,-678598811,-1573232971,-713327747,-1135871617,279587119,1028026319,-375734125,-821896048,-35459810\\n111054,24,1,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n111054,21,1,0,0,0\\n111054,12,2,-420982355\\n111054,13,2,-157106595,-1924286789,-362860954,-1507792970,130637544,-2070650263,-1865856204,943673401,-1354592605,-1364033292\\n111054,24,2,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n111054,21,2,0,0,0\\n111054,12,3,1040695652\\n111054,13,3,-2051066971,1665070997,10335235,-1043375603,-384116279,-452337012,196889099,384637727,-1565897730,204794780\\n111054,24,3,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n111054,21,3,0,0,0\\n111054,12,4,-2038425266\\n111054,13,4,-260424037,-836688812,-713597536,399409907,1425857511,1162428459,-1434812818,1485418424,1012061088,-916911544\\n111054,24,4,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n111054,21,4,0,0,0\\n111054,14,5,-659819109\\n111054,16,5,964056133,-2130031287,117765555,964056133,964056133,964056133,964056133,964056133,964056133,964056133\\n111054,17,5,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133\\n111054,14,6,1999451562\\n111054,16,6,964056133,1714463741,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133\\n111054,17,6,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133,964056133\\n111054,15,-988227918\\n111054,10\\n111054,0\\n111054,2,4,5,0,0,0,0,1,0,0,0,0,0,0\\n111054,2,1,2,0,0,0,0,6,0,0,0,0,0,0\\n111054,2,2,3,0,0,0,0,6,0,0,0,0,0,0\\n111054,2,3,8,0,0,0,0,6,0,0,0,0,0,0\\n111054,6\\n\"],\"enemy_dead_bit\":[7,7],\"bossid\":";
    public static final String BATTLESOLOEND_1 = "{\"progress\":1,\"is_clear\":1,\"input_cmd\":[\"86092,12,1,-345701819\\n86092,13,1,918288534,1317022023,-1381316606,1323454491,930281386,-2099391674,-1011425084,-310330939,341901425,1778302089\\n86092,12,2,1679576390\\n86092,13,2,-1921566795,694835855,-136369704,-1536331276,885303797,938689926,736685983,-478098567,805622766,1059701364\\n86092,12,3,1711516929\\n86092,13,3,-1354214784,-1536331276,-1052474299,-423306017,96906387,206897531,-788319515,-654049063,-1197097309,837295655\\n86092,12,4,-678391685\\n86092,13,4,1059701364,1646477942,-863242427,885303797,1501455446,-1536331276,-1100482971,-569432478,1809517484,417860889\\n86092,14,5,-1811517166,-53851249\\n86092,14,6,1652470028,-1101633416\\n86092,14,7,683261599,-1719796844\\n86092,14,8,-1136481224,1602949194\\n86092,15,-117239005\\n86092,10\\n86092,0\\n86092,3,4\\n86092,3,3\\n86092,3,2\\n86092,2,1,0,0,0,0,8,0,0,0,0,6\\n86092,6\\n86092,1\\n75792,10\\n75792,0\\n75792,3,4\\n75792,3,3\\n75792,3,2\\n75792,2,1,0,0,0,0,7,0,0,0,0,6\\n75792,6\\n75792,1\\n64792,10\\n64792,0\\n64792,3,4\\n64792,3,3\\n64792,3,2\\n64792,2,1,0,0,6,0,0,0,0,5,0,0\\n64792,6\\n64792,1\\n44532,10\\n44532,0\\n47847,3,4\\n47847,3,3\\n47847,3,2\\n47847,2,1,3,0,0,0,0,6,0,0,0,0\\n47847,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,0,4,9,0,0,0,7,7\\n78607,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,5,0,6,0,0,1,0,5\\n78607,6\\n\"],\"enemy_dead_bit\":[15],\"bossid\":";
    public static final String BATTLESOLOEND_1_1 = "{\"progress\":1,\"is_clear\":1,\"input_cmd\":[\"86092,12,1,-345701819\\n86092,13,1,918288534,1317022023,-1381316606,1323454491,930281386,-2099391674,-1011425084,-310330939,341901425,1778302089\\n86092,12,2,1679576390\\n86092,13,2,-1921566795,694835855,-136369704,-1536331276,885303797,938689926,736685983,-478098567,805622766,1059701364\\n86092,12,3,1711516929\\n86092,13,3,-1354214784,-1536331276,-1052474299,-423306017,96906387,206897531,-788319515,-654049063,-1197097309,837295655\\n86092,12,4,-678391685\\n86092,13,4,1059701364,1646477942,-863242427,885303797,1501455446,-1536331276,-1100482971,-569432478,1809517484,417860889\\n86092,14,5,-1811517166,-53851249\\n86092,14,6,1652470028,-1101633416\\n86092,14,7,683261599,-1719796844\\n86092,14,8,-1136481224,1602949194\\n86092,15,-117239005\\n86092,10\\n86092,0\\n86092,3,4\\n86092,3,3\\n86092,3,2\\n86092,2,1,0,0,0,0,8,0,0,0,0,6\\n86092,6\\n86092,1\\n75792,10\\n75792,0\\n75792,3,4\\n75792,3,3\\n75792,3,2\\n75792,2,1,0,0,0,0,7,0,0,0,0,6\\n75792,6\\n75792,1\\n64792,10\\n64792,0\\n64792,3,4\\n64792,3,3\\n64792,3,2\\n64792,2,1,0,0,6,0,0,0,0,5,0,0\\n64792,6\\n64792,1\\n44532,10\\n44532,0\\n47847,3,4\\n47847,3,3\\n47847,3,2\\n47847,2,1,3,0,0,0,0,6,0,0,0,0\\n47847,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,0,4,9,0,0,0,7,7\\n78607,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,5,0,6,0,0,1,0,5\\n78607,6\\n\"],\"enemy_dead_bit\":[1],\"bossid\":";
    public static final String BATTLESOLOEND_1_2 = "{\"progress\":1,\"is_clear\":1,\"input_cmd\":[\"86092,12,1,-345701819\\n86092,13,1,918288534,1317022023,-1381316606,1323454491,930281386,-2099391674,-1011425084,-310330939,341901425,1778302089\\n86092,12,2,1679576390\\n86092,13,2,-1921566795,694835855,-136369704,-1536331276,885303797,938689926,736685983,-478098567,805622766,1059701364\\n86092,12,3,1711516929\\n86092,13,3,-1354214784,-1536331276,-1052474299,-423306017,96906387,206897531,-788319515,-654049063,-1197097309,837295655\\n86092,12,4,-678391685\\n86092,13,4,1059701364,1646477942,-863242427,885303797,1501455446,-1536331276,-1100482971,-569432478,1809517484,417860889\\n86092,14,5,-1811517166,-53851249\\n86092,14,6,1652470028,-1101633416\\n86092,14,7,683261599,-1719796844\\n86092,14,8,-1136481224,1602949194\\n86092,15,-117239005\\n86092,10\\n86092,0\\n86092,3,4\\n86092,3,3\\n86092,3,2\\n86092,2,1,0,0,0,0,8,0,0,0,0,6\\n86092,6\\n86092,1\\n75792,10\\n75792,0\\n75792,3,4\\n75792,3,3\\n75792,3,2\\n75792,2,1,0,0,0,0,7,0,0,0,0,6\\n75792,6\\n75792,1\\n64792,10\\n64792,0\\n64792,3,4\\n64792,3,3\\n64792,3,2\\n64792,2,1,0,0,6,0,0,0,0,5,0,0\\n64792,6\\n64792,1\\n44532,10\\n44532,0\\n47847,3,4\\n47847,3,3\\n47847,3,2\\n47847,2,1,3,0,0,0,0,6,0,0,0,0\\n47847,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,0,4,9,0,0,0,7,7\\n78607,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,5,0,6,0,0,1,0,5\\n78607,6\\n\"],\"enemy_dead_bit\":[3],\"bossid\":";
    public static final String BATTLESOLOEND_1_3 = "{\"progress\":1,\"is_clear\":1,\"input_cmd\":[\"86092,12,1,-345701819\\n86092,13,1,918288534,1317022023,-1381316606,1323454491,930281386,-2099391674,-1011425084,-310330939,341901425,1778302089\\n86092,12,2,1679576390\\n86092,13,2,-1921566795,694835855,-136369704,-1536331276,885303797,938689926,736685983,-478098567,805622766,1059701364\\n86092,12,3,1711516929\\n86092,13,3,-1354214784,-1536331276,-1052474299,-423306017,96906387,206897531,-788319515,-654049063,-1197097309,837295655\\n86092,12,4,-678391685\\n86092,13,4,1059701364,1646477942,-863242427,885303797,1501455446,-1536331276,-1100482971,-569432478,1809517484,417860889\\n86092,14,5,-1811517166,-53851249\\n86092,14,6,1652470028,-1101633416\\n86092,14,7,683261599,-1719796844\\n86092,14,8,-1136481224,1602949194\\n86092,15,-117239005\\n86092,10\\n86092,0\\n86092,3,4\\n86092,3,3\\n86092,3,2\\n86092,2,1,0,0,0,0,8,0,0,0,0,6\\n86092,6\\n86092,1\\n75792,10\\n75792,0\\n75792,3,4\\n75792,3,3\\n75792,3,2\\n75792,2,1,0,0,0,0,7,0,0,0,0,6\\n75792,6\\n75792,1\\n64792,10\\n64792,0\\n64792,3,4\\n64792,3,3\\n64792,3,2\\n64792,2,1,0,0,6,0,0,0,0,5,0,0\\n64792,6\\n64792,1\\n44532,10\\n44532,0\\n47847,3,4\\n47847,3,3\\n47847,3,2\\n47847,2,1,3,0,0,0,0,6,0,0,0,0\\n47847,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,0,4,9,0,0,0,7,7\\n78607,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,5,0,6,0,0,1,0,5\\n78607,6\\n\"],\"enemy_dead_bit\":[7],\"bossid\":";
    public static final String BATTLESOLOEND_1_4 = "{\"progress\":1,\"is_clear\":1,\"input_cmd\":[\"86092,12,1,-345701819\\n86092,13,1,918288534,1317022023,-1381316606,1323454491,930281386,-2099391674,-1011425084,-310330939,341901425,1778302089\\n86092,12,2,1679576390\\n86092,13,2,-1921566795,694835855,-136369704,-1536331276,885303797,938689926,736685983,-478098567,805622766,1059701364\\n86092,12,3,1711516929\\n86092,13,3,-1354214784,-1536331276,-1052474299,-423306017,96906387,206897531,-788319515,-654049063,-1197097309,837295655\\n86092,12,4,-678391685\\n86092,13,4,1059701364,1646477942,-863242427,885303797,1501455446,-1536331276,-1100482971,-569432478,1809517484,417860889\\n86092,14,5,-1811517166,-53851249\\n86092,14,6,1652470028,-1101633416\\n86092,14,7,683261599,-1719796844\\n86092,14,8,-1136481224,1602949194\\n86092,15,-117239005\\n86092,10\\n86092,0\\n86092,3,4\\n86092,3,3\\n86092,3,2\\n86092,2,1,0,0,0,0,8,0,0,0,0,6\\n86092,6\\n86092,1\\n75792,10\\n75792,0\\n75792,3,4\\n75792,3,3\\n75792,3,2\\n75792,2,1,0,0,0,0,7,0,0,0,0,6\\n75792,6\\n75792,1\\n64792,10\\n64792,0\\n64792,3,4\\n64792,3,3\\n64792,3,2\\n64792,2,1,0,0,6,0,0,0,0,5,0,0\\n64792,6\\n64792,1\\n44532,10\\n44532,0\\n47847,3,4\\n47847,3,3\\n47847,3,2\\n47847,2,1,3,0,0,0,0,6,0,0,0,0\\n47847,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,0,4,9,0,0,0,7,7\\n78607,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,5,0,6,0,0,1,0,5\\n78607,6\\n\"],\"enemy_dead_bit\":[15],\"bossid\":";
    public static final String BATTLESOLOEND_1_5 = "{\"progress\":1,\"is_clear\":1,\"input_cmd\":[\"86092,12,1,-345701819\\n86092,13,1,918288534,1317022023,-1381316606,1323454491,930281386,-2099391674,-1011425084,-310330939,341901425,1778302089\\n86092,12,2,1679576390\\n86092,13,2,-1921566795,694835855,-136369704,-1536331276,885303797,938689926,736685983,-478098567,805622766,1059701364\\n86092,12,3,1711516929\\n86092,13,3,-1354214784,-1536331276,-1052474299,-423306017,96906387,206897531,-788319515,-654049063,-1197097309,837295655\\n86092,12,4,-678391685\\n86092,13,4,1059701364,1646477942,-863242427,885303797,1501455446,-1536331276,-1100482971,-569432478,1809517484,417860889\\n86092,14,5,-1811517166,-53851249\\n86092,14,6,1652470028,-1101633416\\n86092,14,7,683261599,-1719796844\\n86092,14,8,-1136481224,1602949194\\n86092,15,-117239005\\n86092,10\\n86092,0\\n86092,3,4\\n86092,3,3\\n86092,3,2\\n86092,2,1,0,0,0,0,8,0,0,0,0,6\\n86092,6\\n86092,1\\n75792,10\\n75792,0\\n75792,3,4\\n75792,3,3\\n75792,3,2\\n75792,2,1,0,0,0,0,7,0,0,0,0,6\\n75792,6\\n75792,1\\n64792,10\\n64792,0\\n64792,3,4\\n64792,3,3\\n64792,3,2\\n64792,2,1,0,0,6,0,0,0,0,5,0,0\\n64792,6\\n64792,1\\n44532,10\\n44532,0\\n47847,3,4\\n47847,3,3\\n47847,3,2\\n47847,2,1,3,0,0,0,0,6,0,0,0,0\\n47847,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,0,4,9,0,0,0,7,7\\n78607,6\\n80817,1\\n78607,10\\n78607,0\\n78607,3,4\\n78607,3,3\\n78607,3,2\\n78607,2,1,0,0,5,0,6,0,0,1,0,5\\n78607,6\\n\"],\"enemy_dead_bit\":[31],\"bossid\":";
    
    
    public static final String PVPEND_1 = ",\"is_win\":1,\"is_retire\":0,\"input_cmd\":[\"118584,23\\n118584,12,1,-779901787\\n118584,13,1,380954487,-2055862069,-1936056056,-1122880927,1811215584,-1317814731,957274114,-1728488298,606525696,2103807510\\n118584,24,1,846106519,1554326151,1726684889,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n118584,21,1,907582053,930457665,2135221977\\n118584,12,2,-909054337\\n118584,13,2,457710510,2147315819,-334273761,-2028955927,-1050855904,-562521986,910296092,-1622085984,426328083,1497485627\\n118584,24,2,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n118584,21,2,-2002863434,-1749013604,904533016\\n118584,12,3,768558282\\n118584,13,3,-1377885165,-912557840,2099994164,-1668049337,1427290768,1779299421,982069515,-2089251016,1761292150,265318336\\n118584,24,3,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n118584,21,3,-1182137684,1039568431,2063163774\\n118584,12,4,1221879799\\n118584,13,4,-891925584,-744094200,-338368981,-642625252,-73334681,1345537569,659450825,557910136,-195896451,1533271000\\n118584,24,4,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n118584,21,4,1226829009,-541441533,1719993868\\n118584,12,5,1491736319\\n118584,13,5,836255362,1189348907,-1912850033,2011889119,1848969104,1955895401,1196372929,-214532175,-269646516,-789684472\\n118584,24,5,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n118584,21,5,-75355656,125983295,0\\n118584,12,6,277334422\\n118584,13,6,1851743680,1088809872,1619837854,1293238953,-867403803,-1284044930,-591828757,-684873001,-1507769732,1885834269\\n118584,24,6,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n118584,21,6,0,0,0\\n118584,12,7,-1669030140\\n118584,13,7,-1138679213,1746941873,35463972,-542571234,1971609937,294511435,1775167157,1635416705,1772303794,1702518799\\n118584,24,7,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n118584,21,7,0,0,0\\n118584,12,8,-1392038809\\n118584,13,8,-236436661,103271882,-796237546,1263151841,-1641869617,508309844,189760885,1691384958,-1870286296,736676286\\n118584,24,8,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644,-1672978644\\n118584,21,8,0,0,0\\n118584,15,789269498\\n118584,18\\n118584,19\\n118584,3,5\\n118584,3,6\\n118584,3,7\\n118584,3,8\\n118584,3,4\\n118584,3,3\\n118584,3,2\\n118584,3,1\\n118584,20\\n118584,11,5\\n118584,11,6\\n118584,11,7\\n118584,11,8\\n\"]}";
    public static final String PVPEND_2 = ",\"is_win\":1,\"is_retire\":0,\"input_cmd\":[\"132503,12,1,339486911\\n132503,13,1,-1608996139,-1588165376,-1502666579,-349612608,984038171,1126713854,-1408357144,-2043448421,-1042867597,-1598180464\\n132503,12,2,-1858151923\\n132503,13,2,-677446419,-742022683,1540009632,1716967459,-498756214,-944049806,398169297,-844010710,-1112506994,18583931\\n132503,12,3,942500761\\n132503,13,3,-268006481,1882257323,-544005472,523508418,-1813624642,812144201,-540573832,1409202678,-1336143726,1215420154\\n132503,12,4,-397615138\\n132503,13,4,954100735,1299080016,-1265448018,-1112961871,-2060630254,1433623568,1656484814,-1893047967,1545092513,1218962322\\n132503,12,5,1085028431\\n132503,13,5,278870723,45304792,621072772,-78489875,1119639587,-1100240491,-276402413,1215420154,54806577,1660188886\\n132503,12,6,2123753432\\n132503,13,6,-2060630254,796202070,90351638,-677446419,-392225507,-2736184,1643769242,-944049806,-1925314405,1089137178\\n132503,12,7,-1872245538\\n132503,13,7,-1260958671,1053012254,-1408357144,-1598180464,365313554,-969484750,379745174,1081823234,-132137868,-697250765\\n132503,12,8,-477240386\\n132503,13,8,808100344,1209191050,-1112961871,900035839,-2060630254,-1265448018,-1882277572,-1893047967,-704794990,-669720384\\n132503,15,-2052943044\\n132503,18\\n132503,19\\n132503,3,4\\n132503,3,3\\n132503,3,2\\n132503,3,5\\n132503,3,6\\n132503,3,7\\n132503,3,8\\n132503,2,1,3,0,0,0,0,6,0,0,0,0\\n132503,20\\n98525,18\\n98525,19\\n98525,3,4\\n98525,3,3\\n98525,3,2\\n98525,3,5\\n98525,3,6\\n98525,3,7\\n98525,3,8\\n98525,2,1,7,0,0,0,0,5,0,0,0,0\\n98525,20\\n95590,18\\n95590,19\\n95590,3,4\\n95590,3,3\\n95590,3,2\\n95590,3,5\\n95590,3,6\\n95590,3,7\\n95590,3,8\\n95590,2,1,4,5,0,0,0,7,5,0,0,0\\n95590,20\\n118348,18\\n118348,19\\n118348,3,4\\n118348,3,3\\n118348,3,2\\n118348,3,6\\n118348,3,7\\n118348,2,1,9,2,0,0,0,7,7,0,0,0\\n118348,20\\n\"]}";
    public static final String PVPEND_3 = ",\"is_win\":1,\"is_retire\":0,\"input_cmd\":[\"132808,12,1,942500761\\n132808,13,1,-268006481,1882257323,-544005472,523508418,-1813624642,812144201,-540573832,1409202678,-1336143726,1215420154\\n132808,12,2,-682709663\\n132808,13,2,-677446419,-742022683,1540009632,1716967459,-498756214,-944049806,-1215120296,1089137178,-1112506994,18583931\\n132808,12,3,-2041322593\\n132808,13,3,-1608996139,-1588165376,-1502666579,-349612608,1368354619,-132137868,-1408357144,-2043448421,-467564368,-1074209055\\n132808,12,4,-900473081\\n132808,13,4,954100735,1299080016,-1265448018,1496559786,-2060630254,-754759099,1656484814,-1893047967,1545092513,1433623568\\n132808,12,5,-1853910686\\n132808,13,5,954100735,900035839,1496559786,932102515,973797180,-1112961871,-2139134660,-669720384,-1882277572,-1893047967\\n132808,12,6,-1871833037\\n132808,13,6,18583931,-51270318,-498756214,1089137178,398169297,659657421,1532352850,90351638,-1236582522,-944049806\\n132808,12,7,1383288404\\n132808,13,7,-1502666579,1141805792,-1103959667,1314473626,1648074592,-1408357144,465690909,-132137868,1081823234,-969484750\\n132808,12,8,-584097748\\n132808,13,8,1215420154,-268006481,1409202678,54806577,523508418,564162986,896427948,96058225,-1655999624,-1100240491\\n132808,15,-2052943044\\n132808,18\\n132808,19\\n132808,3,4\\n132808,3,3\\n132808,3,2\\n132808,3,5\\n132808,3,6\\n132808,3,7\\n132808,3,8\\n132808,2,1,9,0,0,0,0,5,0,0,0,0\\n132808,20\\n128213,18\\n128213,19\\n128213,3,4\\n128213,3,3\\n128213,3,2\\n128213,3,5\\n128213,3,6\\n128213,3,7\\n128213,3,8\\n128213,2,1,4,0,0,0,0,8,0,0,0,0\\n128213,20\\n103407,18\\n103407,19\\n111459,3,4\\n111459,3,3\\n111459,3,2\\n111459,3,5\\n111459,3,6\\n111459,3,7\\n111459,2,1,2,0,0,0,0,5,0,0,0,0\\n111459,20\\n46672,18\\n46672,19\\n54724,3,4\\n54724,3,3\\n54724,3,2\\n54724,3,5\\n54724,3,6\\n54724,2,1,5,7,0,0,0,5,5,0,0,0\\n54724,20\\n\"]}";
    public static final String PVPEND_4 = ",\"is_win\":1,\"is_retire\":0,\"input_cmd\":[\"132503,12,1,-397615138\\n132503,13,1,954100735,1299080016,-1265448018,-1112961871,-2060630254,1433623568,1656484814,-1893047967,1545092513,1218962322\\n132503,12,2,-1858151923\\n132503,13,2,-677446419,-742022683,1540009632,1716967459,-498756214,-944049806,398169297,-844010710,-1112506994,18583931\\n132503,12,3,339486911\\n132503,13,3,-1608996139,-1588165376,-1502666579,-349612608,984038171,1126713854,-1408357144,-2043448421,-1042867597,-1598180464\\n132503,12,4,942500761\\n132503,13,4,-268006481,1882257323,-544005472,523508418,-1813624642,812144201,-540573832,1409202678,-1336143726,1215420154\\n132503,12,5,1947599841\\n132503,13,5,-1588165376,-1936920291,-1598180464,-132137868,1141805792,-969484750,1314473626,-1408357144,365313554,1359017595\\n132503,12,6,682609160\\n132503,13,6,18583931,1429314047,1532352850,-1936920291,-367127359,2133644743,1089137178,-844010710,90351638,-1215120296\\n132503,12,7,708699341\\n132503,13,7,1215420154,-544005472,-1162967391,1119639587,-268006481,45304792,-1936920291,-1336143726,171835926,96058225\\n132503,12,8,-985644126\\n132503,13,8,-2060630254,-2139134660,1209191050,932102515,-1893047967,-704794990,111116986,-111066233,1517875280,-1112961871\\n132503,15,-2052943044\\n132503,18\\n132503,19\\n132503,3,4\\n132503,3,3\\n132503,3,2\\n132503,3,5\\n132503,3,6\\n132503,3,7\\n132503,3,8\\n132503,2,1,7,0,0,0,0,1,0,0,0,0\\n132503,20\\n122036,18\\n122036,19\\n122036,3,4\\n122036,3,3\\n122036,3,2\\n122036,3,5\\n122036,3,6\\n122036,3,7\\n122036,3,8\\n122036,2,1,9,8,0,0,0,1,1,0,0,0\\n122036,20\\n91549,18\\n91549,19\\n97713,3,4\\n97713,3,3\\n97713,3,2\\n97713,3,5\\n97713,3,6\\n97713,3,7\\n97713,3,8\\n97713,2,1,2,0,0,0,0,1,0,0,0,0\\n97713,20\\n88118,18\\n88118,19\\n94282,3,4\\n94282,3,3\\n94282,3,2\\n94282,3,5\\n94282,3,6\\n94282,3,7\\n94282,3,8\\n94282,2,1,3,6,0,0,0,1,1,0,0,0\\n94282,20\\n103504,18\\n103504,19\\n108257,3,4\\n108257,3,3\\n108257,3,2\\n108257,3,5\\n108257,3,6\\n108257,3,7\\n108257,3,8\\n108257,2,1,7,4,0,0,0,1,1,0,0,0\\n108257,20\\n94890,18\\n94890,19\\n94890,3,4\\n94890,3,3\\n94890,3,2\\n94890,3,7\\n94890,2,1,3,5,0,0,0,1,1,0,0,0\\n94890,20\\n\"]}";
}
