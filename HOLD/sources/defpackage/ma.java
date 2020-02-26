package defpackage;

import android.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: ma  reason: default package */
/* compiled from: PG */
public abstract class ma extends qx {
    public final Fragment a() {
        return getParentFragment();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final RecyclerView a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        VerticalGridView verticalGridView = (VerticalGridView) layoutInflater.inflate((int) R.layout.leanback_preferences_list, viewGroup, false);
        verticalGridView.g(3);
        verticalGridView.requestLayout();
        verticalGridView.a(new rk(verticalGridView));
        return verticalGridView;
    }
}
