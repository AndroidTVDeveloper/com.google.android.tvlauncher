package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pe */
/* compiled from: PG */
public class C0412pe extends FrameLayout {

    /* renamed from: a */
    private float f10123a;

    /* renamed from: b */
    private float f10124b;

    /* renamed from: c */
    private float f10125c;

    /* renamed from: d */
    private int f10126d;

    /* renamed from: e */
    private Interpolator f10127e;

    /* renamed from: f */
    private float f10128f;

    /* renamed from: h */
    public ViewGroup f10129h;

    /* renamed from: i */
    public final List f10130i;

    /* renamed from: j */
    public ArrayList f10131j;

    /* renamed from: k */
    public int f10132k;

    /* renamed from: l */
    public List f10133l;

    /* renamed from: m */
    public int f10134m;

    /* renamed from: n */
    public int f10135n;

    /* renamed from: o */
    public final boc f10136o;

    public C0412pe(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pickerStyle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, pe, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public C0412pe(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10130i = new ArrayList();
        this.f10128f = 3.0f;
        this.f10132k = 0;
        this.f10133l = new ArrayList();
        this.f10136o = new C0409pb(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0324ly.f9936f, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0324ly.f9936f, attributeSet, obtainStyledAttributes, i, 0);
        }
        this.f10134m = obtainStyledAttributes.getResourceId(0, R.layout.lb_picker_item);
        this.f10135n = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        setEnabled(true);
        setDescendantFocusability(262144);
        this.f10124b = 1.0f;
        this.f10123a = 1.0f;
        this.f10125c = 0.5f;
        this.f10126d = 200;
        this.f10127e = new DecelerateInterpolator(2.5f);
        this.f10129h = (ViewGroup) ((ViewGroup) LayoutInflater.from(getContext()).inflate((int) R.layout.lb_picker, (ViewGroup) this, true)).findViewById(R.id.picker);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    /* renamed from: a */
    public final C0413pf mo5733a(int i) {
        ArrayList arrayList = this.f10131j;
        if (arrayList != null) {
            return (C0413pf) arrayList.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final int mo5732a() {
        ArrayList arrayList = this.f10131j;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: a */
    public void mo1067a(int i, int i2) {
        C0413pf pfVar = (C0413pf) this.f10131j.get(i);
        if (pfVar.f10137a != i2) {
            pfVar.f10137a = i2;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2 = this.f10132k;
        if (i2 < 0 || i2 >= this.f10130i.size()) {
            return false;
        }
        return ((VerticalGridView) this.f10130i.get(i2)).requestFocus(i, rect);
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        for (int i = 0; i < this.f10130i.size(); i++) {
            if (((VerticalGridView) this.f10130i.get(i)).hasFocus()) {
                if (this.f10132k != i) {
                    this.f10132k = i;
                    for (int i2 = 0; i2 < this.f10130i.size(); i2++) {
                        mo5737b(i2);
                    }
                }
                VerticalGridView verticalGridView = (VerticalGridView) this.f10130i.get(i);
                if (hasFocus()) {
                    verticalGridView.requestFocus();
                }
            }
        }
    }

    public final void setActivated(boolean z) {
        int i;
        if (z == isActivated()) {
            super.setActivated(z);
            return;
        }
        super.setActivated(z);
        boolean hasFocus = hasFocus();
        int i2 = this.f10132k;
        setDescendantFocusability(131072);
        if (!z && hasFocus && isFocusable()) {
            requestFocus();
            i = 0;
        } else {
            i = 0;
        }
        while (i < mo5732a()) {
            ((VerticalGridView) this.f10130i.get(i)).setFocusable(z);
            i++;
        }
        for (int i3 = 0; i3 < mo5732a(); i3++) {
            mo5736a((VerticalGridView) this.f10130i.get(i3));
        }
        boolean isActivated = isActivated();
        for (int i4 = 0; i4 < mo5732a(); i4++) {
            VerticalGridView verticalGridView = (VerticalGridView) this.f10130i.get(i4);
            for (int i5 = 0; i5 < verticalGridView.getChildCount(); i5++) {
                verticalGridView.getChildAt(i5).setFocusable(isActivated);
            }
        }
        if (z && hasFocus && i2 >= 0) {
            ((VerticalGridView) this.f10130i.get(i2)).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    /* renamed from: a */
    public final void mo5734a(int i, C0413pf pfVar) {
        this.f10131j.set(i, pfVar);
        VerticalGridView verticalGridView = (VerticalGridView) this.f10130i.get(i);
        C0410pc pcVar = (C0410pc) verticalGridView.f1067g;
        if (pcVar != null) {
            pcVar.mo5303O();
        }
        verticalGridView.mo5617i(pfVar.f10137a - pfVar.f10138b);
    }

    /* renamed from: a */
    private final void m8174a(View view, boolean z, float f, Interpolator interpolator) {
        view.animate().cancel();
        if (!z) {
            view.setAlpha(f);
        } else {
            view.animate().alpha(f).setDuration((long) this.f10126d).setInterpolator(interpolator).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5735a(View view, boolean z, int i, boolean z2) {
        boolean z3 = true;
        if (i != this.f10132k && hasFocus()) {
            z3 = false;
        }
        if (!z) {
            if (!z3) {
                m8174a(view, z2, 0.0f, this.f10127e);
            } else {
                m8174a(view, z2, this.f10125c, this.f10127e);
            }
        } else if (!z3) {
            m8174a(view, z2, this.f10123a, this.f10127e);
        } else {
            m8174a(view, z2, this.f10124b, this.f10127e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pe.a(android.view.View, boolean, int, boolean):void
     arg types: [android.view.View, boolean, int, int]
     candidates:
      pe.a(android.view.View, boolean, float, android.view.animation.Interpolator):void
      pe.a(android.view.View, boolean, int, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5737b(int i) {
        VerticalGridView verticalGridView = (VerticalGridView) this.f10130i.get(i);
        int r = verticalGridView.mo5622r();
        int i2 = 0;
        while (i2 < verticalGridView.f1067g.mo2794a()) {
            View c = verticalGridView.f1068h.mo5363c(i2);
            if (c != null) {
                mo5735a(c, r == i2, i, true);
            }
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo5736a(VerticalGridView verticalGridView) {
        float f;
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        if (isActivated()) {
            f = this.f10128f;
        } else {
            f = 1.0f;
        }
        layoutParams.height = (int) ((((float) getContext().getResources().getDimensionPixelSize(R.dimen.picker_item_height)) * f) + (((float) verticalGridView.f9985L.f10055x) * (f - 4.0f)));
        verticalGridView.setLayoutParams(layoutParams);
    }
}
