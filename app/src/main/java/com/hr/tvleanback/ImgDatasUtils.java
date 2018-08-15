package com.hr.tvleanback;

import java.util.Random;

/**
 * Created by owen on 2017/6/22.
 */

public class ImgDatasUtils {
    private static Random random = new Random();
    private static String[] imgs = new String[]{
            "http://pic4.nipic.com/20091113/2847083_105626034638_2.jpg",
            "http://a3.topitme.com/1/21/79/1128833621e7779211o.jpg",
            "http://fd.topitme.com/d/a8/1d/11315383988791da8do.jpg",
            "http://pic14.photophoto.cn/20100127/0036036848818577_b.jpg",
            "http://pic27.photophoto.cn/20130410/0005018344802601_b.jpg",
            "http://pic9.nipic.com/20100919/5123760_093408576078_2.jpg",
            "http://imgk.zol.com.cn/dcbbs/10430/a10429839.jpg",
            "http://img.taopic.com/uploads/allimg/140702/240404-140F20IG486.jpg",
            "http://pic9.nipic.com/20100915/2531170_123841801039_2.jpg",
            "http://f0.topitme.com/0/05/be/11269838091bfbe050o.jpg",
            "http://pic21.photophoto.cn/20111011/0006019003288114_b.jpg",
            "http://img01.taopic.com/140926/318765-14092621112261.jpg",
            "http://img.taopic.com/uploads/allimg/140816/235034-140Q60K05695.jpg",
            "http://pic.58pic.com/58pic/13/71/22/35T58PICrEk_1024.jpg",
            "http://pic37.nipic.com/20140106/7487939_080634706000_2.jpg",
            "http://pic.58pic.com/58pic/13/71/05/32M58PICZKY_1024.jpg",
            "http://pic35.photophoto.cn/20150402/0011024033183316_b.jpg",
            "http://pic36.photophoto.cn/20150827/0034034445644511_b.jpg",
            "http://pic35.photophoto.cn/20150424/0006019003032439_b.jpg",
            "http://pic35.photophoto.cn/20150609/0034034813658910_b.jpg",
            "http://img15.3lian.com/2015/a1/14/d/91.jpg",
            "http://pic.58pic.com/58pic/13/70/38/23C58PICQix_1024.jpg",
            "http://pic1.16pic.com/00/07/66/16pic_766152_b.jpg",
            "http://pic21.photophoto.cn/20111218/0006019011129836_b.jpg",
            "http://pic33.photophoto.cn/20141117/0005018399944269_b.jpg",
            "http://pic2.16pic.com/00/38/90/16pic_3890098_b.jpg",
            "http://pic.qiantucdn.com/58pic/18/82/05/56554b628af9b_1024.jpg",
            "http://pic33.photophoto.cn/20141230/0005018396559443_b.jpg",
            "http://pic34.photophoto.cn/20150115/0005018342946629_b.jpg",
            "http://pic33.photophoto.cn/20141214/0005018351439652_b.jpg",
            "http://pic31.nipic.com/20130801/11373465_124443497000_2.jpg",
            "http://pic.eastlady.cn/uploads/tp/201706/9999/e8a82ad785.jpg",
            "http://img.tupianzj.com/uploads/allimg/170320/0956032G9-0.jpg",
            "http://images.haiwainet.cn/2018/0301/20180301100750812.jpg",
            "http://pic.qiantucdn.com/58pic/26/08/91/58bdf307d07cf_1024.jpg",
            "http://pic12.photophoto.cn/20090731/0034034828392826_b.jpg",
            "http://pic.58pic.com/58pic/13/76/32/89858PIC4tU_1024.jpg",
            "http://pic3.16pic.com/00/11/93/16pic_1193636_b.jpg",
            "http://pic.58pic.com/58pic/15/75/37/33s58PICB4f_1024.jpg",
            "http://pic.58pic.com/58pic/13/70/52/92U58PICeXu_1024.jpg",
            "http://pic35.photophoto.cn/20150529/0040039509233850_b.jpg",
            "http://pic.58pic.com/58pic/13/17/99/28J58PICjfB_1024.jpg",
            "http://pic.58pic.com/58pic/14/64/56/25h58PIC3eG_1024.jpg",
            "http://img.zcool.cn/community/017fcc5535f1710000001e3101c50c.jpg",
            "http://reso3.yiihuu.com/img_703568.jpg",
            "http://img05.tooopen.com/images/20150520/tooopen_sy_125311226742.jpg",
            "http://img5.imgtn.bdimg.com/it/u=332347801,3887651404&fm=27&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=3203805412,4179644444&fm=27&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=2470809667,933912309&fm=27&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1748051475,3837428098&fm=27&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=132600321,3123081067&fm=27&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1094595333,134359380&fm=27&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2459584015,600700003&fm=27&gp=0.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531304677752&di=ff91b687a04238635bef3164d76d9e4d&imgtype=0&src=http%3A%2F%2Fimg5q.duitang.com%2Fuploads%2Fitem%2F201505%2F26%2F20150526212317_xN2cv.gif",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531304827891&di=3c3fa3ee9221c29ddbc4cb8b82fb3e58&imgtype=0&src=http%3A%2F%2Fimg5q.duitang.com%2Fuploads%2Fitem%2F201505%2F24%2F20150524230953_KEjRw.gif",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531304845611&di=8a91f5df7eff92276b58a559c66e74fc&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01605757d7cf370000018c1b018236.gif",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531304911287&di=eb2fcd4a5ce28b2d1c0247763e9cfdf5&imgtype=0&src=http%3A%2F%2Fimg3.duitang.com%2Fuploads%2Fitem%2F201411%2F25%2F20141125205504_xTaSL.gif"
    };
    
    public static String getUrl() {
        return imgs[random.nextInt(imgs.length)];
    }
}
