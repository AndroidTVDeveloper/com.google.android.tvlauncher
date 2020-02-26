package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.AddFavoriteAppCardView;

/* renamed from: cpc  reason: default package */
/* compiled from: PG */
final class cpc extends cpn implements View.OnClickListener {
    private Intent p;

    public cpc(cpo cpo, View view) {
        super(cpo, view);
        this.a.setOnClickListener(this);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.card_rounded_corner_radius);
        this.z.setOutlineProvider(new coz(dimensionPixelSize));
        this.z.setClipToOutline(true);
        this.a.setOutlineProvider(new cpa(dimensionPixelSize));
        if (!dcy.d(this.y)) {
            this.B.e = new cpb(this);
        }
    }

    public final void onClick(View view) {
        try {
            this.y.startActivity(this.p);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.y, (int) R.string.failed_launch, 0).show();
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Cannot start activity : ");
            sb.append(valueOf);
            Log.e("FavLaunchItemsAdapter", sb.toString());
        }
    }

    public final void a(chn chn) {
        this.p = chn.a;
    }

    public final void u() {
        int i;
        super.u();
        View view = this.a;
        AddFavoriteAppCardView addFavoriteAppCardView = (AddFavoriteAppCardView) view;
        if (!view.isFocused()) {
            i = 4;
        } else {
            i = 0;
        }
        addFavoriteAppCardView.b = i;
        addFavoriteAppCardView.a.setVisibility(i);
    }
}
