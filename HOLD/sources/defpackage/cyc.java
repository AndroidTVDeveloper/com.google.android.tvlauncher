package defpackage;

import android.database.Cursor;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.notifications.NotificationDismissButton;
import com.google.android.tvlauncher.notifications.NotificationPanelItemView;

/* renamed from: cyc  reason: default package */
/* compiled from: PG */
public final class cyc extends jp implements cfp, cyo {
    public VerticalGridView b;
    public final Handler c = new Handler();
    public final Runnable d = new cyb(this);
    private final cfp e;
    private Cursor f = null;

    public cyc(cfp cfp) {
        this.e = cfp;
        a(true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void a(Cursor cursor) {
        int i;
        this.f = cursor;
        O();
        Cursor cursor2 = this.f;
        if (cursor2 != null) {
            int count = cursor2.getCount();
            cfs cfs = new cfs(13, 0);
            dja f2 = cfs.f();
            if (this.f.moveToFirst()) {
                i = 0;
                do {
                    int i2 = this.f.getInt(7);
                    if (i2 == 5) {
                        i++;
                    }
                    dja l = dmu.e.l();
                    String string = this.f.getString(1);
                    if (l.b) {
                        l.b();
                        l.b = false;
                    }
                    dmu dmu = (dmu) l.a;
                    string.getClass();
                    dmu.a |= 1;
                    dmu.b = string;
                    int c2 = cfs.c(i2);
                    if (l.b) {
                        l.b();
                        l.b = false;
                    }
                    dmu dmu2 = (dmu) l.a;
                    if (c2 != 0) {
                        dmu2.d = c2;
                        dmu2.a |= 4;
                        String string2 = this.f.getString(2);
                        if (!TextUtils.isEmpty(string2)) {
                            if (l.b) {
                                l.b();
                                l.b = false;
                            }
                            dmu dmu3 = (dmu) l.a;
                            string2.getClass();
                            dmu3.a |= 2;
                            dmu3.c = string2;
                        }
                        if (f2.b) {
                            f2.b();
                            f2.b = false;
                        }
                        dmv dmv = (dmv) f2.a;
                        dmu dmu4 = (dmu) l.g();
                        dmv dmv2 = dmv.f;
                        dmu4.getClass();
                        if (!dmv.e.a()) {
                            dmv.e = dje.a(dmv.e);
                        }
                        dmv.e.add(dmu4);
                    } else {
                        throw null;
                    }
                } while (this.f.moveToNext());
            } else {
                i = 0;
            }
            if (f2.b) {
                f2.b();
                f2.b = false;
            }
            dmv dmv3 = (dmv) f2.a;
            dmv dmv4 = dmv.f;
            int i3 = dmv3.a | 1;
            dmv3.a = i3;
            dmv3.b = count;
            dmv3.a = i3 | 2;
            dmv3.c = i;
            this.e.a(cfs);
        }
    }

    public final int a() {
        Cursor cursor = this.f;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }

    public final long b(int i) {
        if (this.f.moveToPosition(i)) {
            return (long) this.f.getString(0).hashCode();
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Can't move cursor to position ");
        sb.append(i);
        Log.wtf("NotifsPanelAdapter", sb.toString());
        return -1;
    }

    public final void a(cfs cfs) {
        this.e.a(cfs);
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar, int i) {
        if (this.f.moveToPosition(i)) {
            cyy a = cyy.a(this.f);
            NotificationPanelItemView notificationPanelItemView = (NotificationPanelItemView) kmVar.a;
            notificationPanelItemView.j = this;
            notificationPanelItemView.i = a;
            notificationPanelItemView.h = a.b;
            notificationPanelItemView.e.setText(a.d);
            notificationPanelItemView.f.setText(a.e);
            boolean z = a.f && !a.g;
            notificationPanelItemView.m = z;
            notificationPanelItemView.n.setVisibility(!z ? 8 : 0);
            notificationPanelItemView.n.setOnClickListener(new cxz(notificationPanelItemView));
            if (TextUtils.isEmpty(a.d)) {
                notificationPanelItemView.g.setContentDescription(a.e);
            } else if (!TextUtils.isEmpty(a.e)) {
                notificationPanelItemView.g.setContentDescription(String.format(notificationPanelItemView.getResources().getString(R.string.notification_content_description_format), a.d, a.e));
            } else {
                notificationPanelItemView.g.setContentDescription(a.d);
            }
            notificationPanelItemView.d.setImageIcon(a.h);
            int i2 = a.j;
            int i3 = a.k;
            notificationPanelItemView.b = i2;
            notificationPanelItemView.c = i3;
            if (i3 == 0) {
                notificationPanelItemView.a = null;
                notificationPanelItemView.setWillNotDraw(true);
            } else {
                if (notificationPanelItemView.a == null) {
                    notificationPanelItemView.a = new RectF();
                }
                notificationPanelItemView.setWillNotDraw(false);
            }
            notificationPanelItemView.requestLayout();
            notificationPanelItemView.g.setVisibility(0);
            notificationPanelItemView.f.measure(0, 0);
            notificationPanelItemView.l = notificationPanelItemView.f.getMeasuredWidth();
            View focusedChild = notificationPanelItemView.getFocusedChild();
            if (focusedChild != null && notificationPanelItemView.l > notificationPanelItemView.k) {
                notificationPanelItemView.f.setMaxLines(Integer.MAX_VALUE);
                notificationPanelItemView.e.setMaxLines(2);
                notificationPanelItemView.setBackgroundColor(notificationPanelItemView.getResources().getColor(R.color.notification_expanded_text_background));
            } else {
                notificationPanelItemView.e.setMaxLines(1);
                notificationPanelItemView.f.setMaxLines(1);
                notificationPanelItemView.setBackgroundColor(0);
            }
            if (notificationPanelItemView.n.hasFocus()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) notificationPanelItemView.o.getLayoutParams();
                marginLayoutParams.setMarginStart(notificationPanelItemView.p);
                notificationPanelItemView.o.setLayoutParams(marginLayoutParams);
                notificationPanelItemView.o.setAlpha(0.4f);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) notificationPanelItemView.o.getLayoutParams();
                marginLayoutParams2.setMarginStart(0);
                notificationPanelItemView.o.setLayoutParams(marginLayoutParams2);
                notificationPanelItemView.o.setAlpha(1.0f);
            }
            NotificationDismissButton notificationDismissButton = notificationPanelItemView.n;
            if (notificationDismissButton.hasFocus()) {
                notificationDismissButton.a.setTint(notificationDismissButton.d);
            } else {
                notificationDismissButton.a.setTint(focusedChild == null ? notificationDismissButton.b : notificationDismissButton.c);
            }
        } else {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Can't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ km a(ViewGroup viewGroup, int i) {
        return new km(LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.notification_panel_item_view, viewGroup, false), (byte) 0);
    }
}
