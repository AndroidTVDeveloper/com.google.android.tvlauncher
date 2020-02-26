package com.google.android.tvlauncher.appsview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class EditModeGridView extends VerticalGridView {

    /* renamed from: O */
    public dad f6411O;

    public EditModeGridView(Context context) {
        this(context, null);
    }

    public EditModeGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditModeGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1065m(getResources().getDimensionPixelSize(R.dimen.app_banner_width) + getResources().getDimensionPixelSize(R.dimen.app_banner_margin_end));
    }

    /* renamed from: f */
    private final boolean m5268f(int i, int i2) {
        return i2 != 17 ? i2 != 33 ? i2 != 66 ? i2 == 130 && i + 4 <= this.f1067g.mo2794a() + -1 : i % 4 < 3 && i < this.f1067g.mo2794a() + -1 : i + -4 >= 0 : i % 4 > 0;
    }

    public final View focusSearch(View view, int i) {
        if (view.isSelected()) {
            return mo3236a(view, i);
        }
        return super.focusSearch(view, i);
    }

    /* renamed from: a */
    private final void m5267a(int i, int i2, int i3) {
        int i4;
        chf chf = (chf) this.f1067g;
        if (i >= 0) {
            int i5 = -1;
            if (i <= chf.f5514b.size() - 1 && i2 >= 0 && i2 <= chf.f5514b.size() - 1) {
                chn chn = (chn) chf.f5514b.get(i);
                chf.f5514b.set(i, (chn) chf.f5514b.get(i2));
                chf.f5514b.set(i2, chn);
                chf.mo5309b(i, i2);
                int i6 = i2 - i;
                if (Math.abs(i6) > 1) {
                    if (i6 <= 0) {
                        i5 = 1;
                    }
                    chf.mo5309b(i5 + i2, i);
                }
                if (i3 == 17) {
                    i4 = 45;
                } else if (i3 == 33) {
                    i4 = 43;
                } else if (i3 == 66) {
                    i4 = 46;
                } else if (i3 == 130) {
                    i4 = 44;
                } else {
                    StringBuilder sb = new StringBuilder(30);
                    sb.append("Invalid direction: ");
                    sb.append(i3);
                    throw new IllegalArgumentException(sb.toString());
                }
                cfs cfs = new cfs(i4);
                cfs.mo2729b(dhs.f8553q);
                cfs.mo2728b(i2 >> 2);
                cfs.mo2724a(i2 & 3);
                dja g = cfs.mo2734g();
                String str = chn.f5563c;
                if (g.f8673b) {
                    g.mo4505b();
                    g.f8673b = false;
                }
                dmj dmj = (dmj) g.f8672a;
                dmj dmj2 = dmj.f8832f;
                str.getClass();
                dmj.f8833a |= 1;
                dmj.f8834b = str;
                cfs.mo2725a(!chn.f5567g ? dhs.f8537a : dhs.f8544h);
                chf.f5521i.mo2714a(cfs);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.tvlauncher.appsview.EditModeGridView.f(int, int):boolean
     arg types: [int, int]
     candidates:
      android.support.v7.widget.RecyclerView.f(int, int):void
      com.google.android.tvlauncher.appsview.EditModeGridView.f(int, int):boolean */
    /* renamed from: a */
    public final View mo3236a(View view, int i) {
        int d = mo858d(view);
        if (this.f1084x.mo4191b()) {
            return view;
        }
        if (getLayoutDirection() == 1) {
            if (i == 17) {
                i = 66;
            } else if (i == 66) {
                i = 17;
            }
        }
        if (m5268f(d, i)) {
            if (i == 17) {
                m5267a(d, d - 1, i);
            } else if (i == 33) {
                m5267a(d, d - 4, i);
            } else if (i == 66) {
                m5267a(d, d + 1, i);
            } else if (i == 130) {
                m5267a(d, d + 4, i);
            }
            mo3237u();
        }
        return view;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.tvlauncher.appsview.EditModeGridView.f(int, int):boolean
     arg types: [int, int]
     candidates:
      android.support.v7.widget.RecyclerView.f(int, int):void
      com.google.android.tvlauncher.appsview.EditModeGridView.f(int, int):boolean */
    /* renamed from: v */
    public final void mo3238v() {
        int d = mo858d(getFocusedChild());
        if (d != -1) {
            this.f6411O.mo4028a(1).mo4058a(m5268f(d, 130));
            this.f6411O.mo4028a(0).mo4058a(m5268f(d, 33));
            int layoutDirection = getLayoutDirection();
            int i = 17;
            int i2 = layoutDirection == 1 ? 17 : 66;
            if (layoutDirection == 1) {
                i = 66;
            }
            this.f6411O.mo4028a(2).mo4058a(m5268f(d, i));
            this.f6411O.mo4028a(3).mo4058a(m5268f(d, i2));
        }
    }

    /* renamed from: u */
    public final void mo3237u() {
        dad dad = this.f6411O;
        if (dad != null && dad.f8024h) {
            mo3238v();
        }
    }
}
