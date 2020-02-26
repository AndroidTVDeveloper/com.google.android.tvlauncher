package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.AddFavoriteAppCardView;

/* renamed from: cpc */
/* compiled from: PG */
final class cpc extends cpn implements View.OnClickListener {

    /* renamed from: p */
    private Intent f6865p;

    public cpc(cpo cpo, View view) {
        super(cpo, view);
        this.f9783a.setOnClickListener(this);
        int dimensionPixelSize = this.f9783a.getResources().getDimensionPixelSize(R.dimen.card_rounded_corner_radius);
        this.f6895z.setOutlineProvider(new coz(dimensionPixelSize));
        this.f6895z.setClipToOutline(true);
        this.f9783a.setOutlineProvider(new cpa(dimensionPixelSize));
        if (!dcy.m6195d(this.f6894y)) {
            this.f6890B.f8308e = new cpb(this);
        }
    }

    public final void onClick(View view) {
        try {
            this.f6894y.startActivity(this.f6865p);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.f6894y, (int) R.string.failed_launch, 0).show();
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Cannot start activity : ");
            sb.append(valueOf);
            Log.e("FavLaunchItemsAdapter", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo3546a(chn chn) {
        this.f6865p = chn.f5561a;
    }

    /* renamed from: u */
    public final void mo3548u() {
        int i;
        super.mo3548u();
        View view = this.f9783a;
        AddFavoriteAppCardView addFavoriteAppCardView = (AddFavoriteAppCardView) view;
        if (!view.isFocused()) {
            i = 4;
        } else {
            i = 0;
        }
        addFavoriteAppCardView.f6446b = i;
        addFavoriteAppCardView.f6445a.setVisibility(i);
    }
}
