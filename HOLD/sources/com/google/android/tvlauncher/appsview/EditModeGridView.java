package com.google.android.tvlauncher.appsview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class EditModeGridView extends VerticalGridView {
    public dad O;

    public EditModeGridView(Context context) {
        this(context, null);
    }

    public EditModeGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditModeGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m(getResources().getDimensionPixelSize(R.dimen.app_banner_width) + getResources().getDimensionPixelSize(R.dimen.app_banner_margin_end));
    }

    private final boolean f(int i, int i2) {
        return i2 != 17 ? i2 != 33 ? i2 != 66 ? i2 == 130 && i + 4 <= this.g.a() + -1 : i % 4 < 3 && i < this.g.a() + -1 : i + -4 >= 0 : i % 4 > 0;
    }

    public final View focusSearch(View view, int i) {
        if (view.isSelected()) {
            return a(view, i);
        }
        return super.focusSearch(view, i);
    }

    private final void a(int i, int i2, int i3) {
        int i4;
        chf chf = (chf) this.g;
        if (i >= 0) {
            int i5 = -1;
            if (i <= chf.b.size() - 1 && i2 >= 0 && i2 <= chf.b.size() - 1) {
                chn chn = (chn) chf.b.get(i);
                chf.b.set(i, (chn) chf.b.get(i2));
                chf.b.set(i2, chn);
                chf.b(i, i2);
                int i6 = i2 - i;
                if (Math.abs(i6) > 1) {
                    if (i6 <= 0) {
                        i5 = 1;
                    }
                    chf.b(i5 + i2, i);
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
                cfs.b(dhs.q);
                cfs.b(i2 >> 2);
                cfs.a(i2 & 3);
                dja g = cfs.g();
                String str = chn.c;
                if (g.b) {
                    g.b();
                    g.b = false;
                }
                dmj dmj = (dmj) g.a;
                dmj dmj2 = dmj.f;
                str.getClass();
                dmj.a |= 1;
                dmj.b = str;
                cfs.a(!chn.g ? dhs.a : dhs.h);
                chf.i.a(cfs);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.tvlauncher.appsview.EditModeGridView.f(int, int):boolean
     arg types: [int, int]
     candidates:
      android.support.v7.widget.RecyclerView.f(int, int):void
      com.google.android.tvlauncher.appsview.EditModeGridView.f(int, int):boolean */
    public final View a(View view, int i) {
        int d = d(view);
        if (this.x.b()) {
            return view;
        }
        if (getLayoutDirection() == 1) {
            if (i == 17) {
                i = 66;
            } else if (i == 66) {
                i = 17;
            }
        }
        if (f(d, i)) {
            if (i == 17) {
                a(d, d - 1, i);
            } else if (i == 33) {
                a(d, d - 4, i);
            } else if (i == 66) {
                a(d, d + 1, i);
            } else if (i == 130) {
                a(d, d + 4, i);
            }
            u();
        }
        return view;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.tvlauncher.appsview.EditModeGridView.f(int, int):boolean
     arg types: [int, int]
     candidates:
      android.support.v7.widget.RecyclerView.f(int, int):void
      com.google.android.tvlauncher.appsview.EditModeGridView.f(int, int):boolean */
    public final void v() {
        int d = d(getFocusedChild());
        if (d != -1) {
            this.O.a(1).a(f(d, 130));
            this.O.a(0).a(f(d, 33));
            int layoutDirection = getLayoutDirection();
            int i = 17;
            int i2 = layoutDirection == 1 ? 17 : 66;
            if (layoutDirection == 1) {
                i = 66;
            }
            this.O.a(2).a(f(d, i));
            this.O.a(3).a(f(d, i2));
        }
    }

    public final void u() {
        dad dad = this.O;
        if (dad != null && dad.h) {
            v();
        }
    }
}
