package p000;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: mh */
/* compiled from: PG */
public abstract class C0334mh extends C0327ma {
    public C0334mh() {
        int i = Build.VERSION.SDK_INT;
        atc.m2046a(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.f10226d.obtainStyledAttributes(null, C0474rm.f10269h, C0035bg.m3102a(this.f10226d, (int) R.attr.preferenceFragmentStyle, 16844038), 0);
        this.f10227e = obtainStyledAttributes.getResourceId(0, this.f10227e);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.f10226d);
        View inflate = cloneInContext.inflate(this.f10227e, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView a = mo5574a(cloneInContext, viewGroup2);
            if (a != null) {
                this.f10225c = a;
                a.mo829a(this.f10223a);
                C0454qt qtVar = this.f10223a;
                if (drawable != null) {
                    qtVar.f10220b = drawable.getIntrinsicHeight();
                } else {
                    qtVar.f10220b = 0;
                }
                qtVar.f10219a = drawable;
                qtVar.f10222d.f10225c.mo908p();
                if (dimensionPixelSize != -1) {
                    C0454qt qtVar2 = this.f10223a;
                    qtVar2.f10220b = dimensionPixelSize;
                    qtVar2.f10222d.f10225c.mo908p();
                }
                this.f10223a.f10221c = z;
                if (this.f10225c.getParent() == null) {
                    viewGroup2.addView(this.f10225c);
                }
                this.f10228f.post(this.f10229g);
                View inflate2 = LayoutInflater.from(inflate.getContext()).inflate((int) R.layout.leanback_preference_fragment, viewGroup, false);
                ViewGroup viewGroup3 = (ViewGroup) inflate2.findViewById(R.id.main_frame);
                if (inflate != null) {
                    viewGroup3.addView(inflate);
                }
                return inflate2;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        super.onViewCreated(view, bundle);
        CharSequence charSequence = mo5793b().f1363q;
        View view2 = getView();
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.decor_title);
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
