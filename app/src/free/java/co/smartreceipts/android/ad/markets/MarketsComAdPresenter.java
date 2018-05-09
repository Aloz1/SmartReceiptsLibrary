package co.smartreceipts.android.ad.markets;

import android.app.Activity;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import co.smartreceipts.android.ad.BaseAdPresenter;
import co.smartreceipts.android.ad.admob.widget.BannerAdView;
import co.smartreceipts.android.analytics.Analytics;
import co.smartreceipts.android.di.scopes.ActivityScope;
import co.smartreceipts.android.purchases.PurchaseManager;
import co.smartreceipts.android.purchases.wallet.PurchaseWallet;
import co.smartreceipts.android.settings.UserPreferenceManager;

@ActivityScope
public class MarketsComAdPresenter extends BaseAdPresenter {

    @Inject
    MarketsComAdPresenter(PurchaseWallet purchaseWallet, Analytics analytics, PurchaseManager purchaseManager, UserPreferenceManager userPreferenceManager) {
        super(purchaseWallet, analytics, purchaseManager, userPreferenceManager);
    }

    @Override
    public BannerAdView initAdView(@NonNull Activity activity, @NonNull Analytics analytics, @NonNull UserPreferenceManager userPreferenceManager) {
        return new MarketsComAdView().init(activity, analytics, userPreferenceManager);
    }
}
