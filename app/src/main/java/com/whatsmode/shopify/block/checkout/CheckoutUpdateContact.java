package com.whatsmode.shopify.block.checkout;


import com.shopify.buy3.Storefront;
import com.shopify.graphql.support.ID;
import com.whatsmode.shopify.block.address.Address;
import com.whatsmode.shopify.block.me.Order;
import com.whatsmode.shopify.mvp.MvpPresenter;
import com.whatsmode.shopify.mvp.MvpView;

import java.util.List;


public class CheckoutUpdateContact {
    interface View extends MvpView{

        ID getCheckoutId();

        void showError(String message);

        void showLoading();

        void hideLoading();

        void checkGiftCard();

        void jumpToLogin();

        void jumpToSelectAddress();

        void showGiftCardLegal(String balance);

        void showGiftIllegal(String message);

        void onShippingResponse(Double tax,List<Storefront.ShippingRate> shippingRates,String url);

        void jumpToPay();

        void jumpToModifyAddress();

        void ViewResponseFailed();

        void ViewResponseSuccess(Order order);

        void updateAddress(Storefront.MailingAddress address, Storefront.ShippingRate shippingRate);

        void fillAddress();

        void jumpToAddressList();
    }

    interface Presenter extends MvpPresenter<View> {

        void onClickView(android.view.View v);

        void checkGiftCard(String cardNum, ID id);

        void checkShippingMethods(ID id,boolean isDefault);

        void bindAddress(ID id, Address a,boolean isDefault);

        void checkOrderExist(ID checkoutId);

        void getAddress(ID id);
    }
}
