package p000;

import android.app.Fragment;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: ma */
/* compiled from: PG */
public abstract class C0327ma extends C0458qx {
    /* renamed from: a */
    public final Fragment mo5573a() {
        return getParentFragment();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final RecyclerView mo5574a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        VerticalGridView verticalGridView = (VerticalGridView) layoutInflater.inflate((int) R.layout.leanback_preferences_list, viewGroup, false);
        verticalGridView.mo5613g(3);
        verticalGridView.requestLayout();
        verticalGridView.mo837a(new C0472rk(verticalGridView));
        return verticalGridView;
    }
}
