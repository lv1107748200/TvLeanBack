package com.hr.tvleanback;


import com.hr.tvleanbacklibrary.widget.HeaderItem;
import com.hr.tvleanbacklibrary.widget.ListRow;
import com.hr.tvleanbacklibrary.widget.ListRowPresenter;
import com.hr.tvleanbacklibrary.widget.Presenter;
import com.hr.tvleanbacklibrary.widget.PresenterSelector;

/*
 * lv   2018/8/15
 */
public class MainPresenterSelector extends PresenterSelector {

    private  ListRowPresenter listRowPresenter ;//普通
    private  MoreZeroListRowPresenter moreZeroListRowPresenter;
    private MoreOneRowPresenter moreOneRowPresenter ;

    public MainPresenterSelector() {
        listRowPresenter = new ListRowPresenter();
        listRowPresenter.setNumRows(2);

        moreZeroListRowPresenter = new MoreZeroListRowPresenter();
        moreZeroListRowPresenter.setNumRows(1);
        moreZeroListRowPresenter.setHeaderPresenter(new HeadRowPresenter());

        moreOneRowPresenter = new MoreOneRowPresenter();
        moreOneRowPresenter.setHeaderPresenter(new HeadRowPresenter());
    }

    @Override
    public Presenter getPresenter(Object item) {

        ListRow listRow = (ListRow) item;

        if(listRow.getContentDescription().toString().equals("more0")){
            return moreZeroListRowPresenter;
        }else if(listRow.getContentDescription().toString().equals("more1")) {
            return moreOneRowPresenter;
        }

        return listRowPresenter;
    }
}
