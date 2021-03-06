package com.whatsmode.shopify.block.main;

import android.support.v4.app.FragmentManager;
import android.view.View;

import com.shopify.graphql.support.ID;
import com.whatsmode.shopify.mvp.MvpPresenter;
import com.whatsmode.shopify.mvp.MvpView;
import com.whatsmode.shopify.ui.helper.BaseFragmentAdapter;

import java.util.List;

class MainContact {
    interface View extends MvpView{
        void setViewPage(BaseFragmentAdapter fragmentAdapter);

        void setToolbarTitle(int mPageTitle);

        void switch2Mode();

        void switch2Influence();

        void switch2Cart();

        void switch2Mine();

        void showMenu();

        void showSearch();

        void deleteCart();

        void jumpToAds(int i);

        void jumpToAboutUs();
    }

    interface Presenter extends MvpPresenter<MainContact.View> {

        void initViewPage(FragmentManager supportFragmentManager);

        void setPageSelected(int position);

        boolean clickMenuItem(int itemId);

        void onClickView(android.view.View v);

        void checkVariantExist(List<ID> ids);
    }
}
