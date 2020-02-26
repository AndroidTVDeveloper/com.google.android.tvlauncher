package p000;

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

/* renamed from: cyc */
/* compiled from: PG */
public final class cyc extends C0261jp implements cfp, cyo {

    /* renamed from: b */
    public VerticalGridView f7906b;

    /* renamed from: c */
    public final Handler f7907c = new Handler();

    /* renamed from: d */
    public final Runnable f7908d = new cyb(this);

    /* renamed from: e */
    private final cfp f7909e;

    /* renamed from: f */
    private Cursor f7910f = null;

    public cyc(cfp cfp) {
        this.f7909e = cfp;
        mo5308a(true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    /* renamed from: a */
    public final void mo3956a(Cursor cursor) {
        int i;
        this.f7910f = cursor;
        mo5303O();
        Cursor cursor2 = this.f7910f;
        if (cursor2 != null) {
            int count = cursor2.getCount();
            cfs cfs = new cfs(13, 0);
            dja f = cfs.mo2733f();
            if (this.f7910f.moveToFirst()) {
                i = 0;
                do {
                    int i2 = this.f7910f.getInt(7);
                    if (i2 == 5) {
                        i++;
                    }
                    dja l = dmu.f8870e.mo4516l();
                    String string = this.f7910f.getString(1);
                    if (l.f8673b) {
                        l.mo4505b();
                        l.f8673b = false;
                    }
                    dmu dmu = (dmu) l.f8672a;
                    string.getClass();
                    dmu.f8871a |= 1;
                    dmu.f8872b = string;
                    int c = cfs.m4665c(i2);
                    if (l.f8673b) {
                        l.mo4505b();
                        l.f8673b = false;
                    }
                    dmu dmu2 = (dmu) l.f8672a;
                    if (c != 0) {
                        dmu2.f8874d = c;
                        dmu2.f8871a |= 4;
                        String string2 = this.f7910f.getString(2);
                        if (!TextUtils.isEmpty(string2)) {
                            if (l.f8673b) {
                                l.mo4505b();
                                l.f8673b = false;
                            }
                            dmu dmu3 = (dmu) l.f8672a;
                            string2.getClass();
                            dmu3.f8871a |= 2;
                            dmu3.f8873c = string2;
                        }
                        if (f.f8673b) {
                            f.mo4505b();
                            f.f8673b = false;
                        }
                        dmv dmv = (dmv) f.f8672a;
                        dmu dmu4 = (dmu) l.mo4509g();
                        dmv dmv2 = dmv.f8875f;
                        dmu4.getClass();
                        if (!dmv.f8880e.mo4374a()) {
                            dmv.f8880e = dje.m6690a(dmv.f8880e);
                        }
                        dmv.f8880e.add(dmu4);
                    } else {
                        throw null;
                    }
                } while (this.f7910f.moveToNext());
            } else {
                i = 0;
            }
            if (f.f8673b) {
                f.mo4505b();
                f.f8673b = false;
            }
            dmv dmv3 = (dmv) f.f8672a;
            dmv dmv4 = dmv.f8875f;
            int i3 = dmv3.f8876a | 1;
            dmv3.f8876a = i3;
            dmv3.f8877b = count;
            dmv3.f8876a = i3 | 2;
            dmv3.f8878c = i;
            this.f7909e.mo2714a(cfs);
        }
    }

    /* renamed from: a */
    public final int mo2794a() {
        Cursor cursor = this.f7910f;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }

    /* renamed from: b */
    public final long mo2835b(int i) {
        if (this.f7910f.moveToPosition(i)) {
            return (long) this.f7910f.getString(0).hashCode();
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Can't move cursor to position ");
        sb.append(i);
        Log.wtf("NotifsPanelAdapter", sb.toString());
        return -1;
    }

    /* renamed from: a */
    public final void mo2714a(cfs cfs) {
        this.f7909e.mo2714a(cfs);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2797a(C0285km kmVar, int i) {
        if (this.f7910f.moveToPosition(i)) {
            cyy a = cyy.m5983a(this.f7910f);
            NotificationPanelItemView notificationPanelItemView = (NotificationPanelItemView) kmVar.f9783a;
            notificationPanelItemView.f6620j = this;
            notificationPanelItemView.f6619i = a;
            notificationPanelItemView.f6618h = a.f7937b;
            notificationPanelItemView.f6615e.setText(a.f7939d);
            notificationPanelItemView.f6616f.setText(a.f7940e);
            boolean z = a.f7941f && !a.f7942g;
            notificationPanelItemView.f6623m = z;
            notificationPanelItemView.f6624n.setVisibility(!z ? 8 : 0);
            notificationPanelItemView.f6624n.setOnClickListener(new cxz(notificationPanelItemView));
            if (TextUtils.isEmpty(a.f7939d)) {
                notificationPanelItemView.f6617g.setContentDescription(a.f7940e);
            } else if (!TextUtils.isEmpty(a.f7940e)) {
                notificationPanelItemView.f6617g.setContentDescription(String.format(notificationPanelItemView.getResources().getString(R.string.notification_content_description_format), a.f7939d, a.f7940e));
            } else {
                notificationPanelItemView.f6617g.setContentDescription(a.f7939d);
            }
            notificationPanelItemView.f6614d.setImageIcon(a.f7943h);
            int i2 = a.f7945j;
            int i3 = a.f7946k;
            notificationPanelItemView.f6612b = i2;
            notificationPanelItemView.f6613c = i3;
            if (i3 == 0) {
                notificationPanelItemView.f6611a = null;
                notificationPanelItemView.setWillNotDraw(true);
            } else {
                if (notificationPanelItemView.f6611a == null) {
                    notificationPanelItemView.f6611a = new RectF();
                }
                notificationPanelItemView.setWillNotDraw(false);
            }
            notificationPanelItemView.requestLayout();
            notificationPanelItemView.f6617g.setVisibility(0);
            notificationPanelItemView.f6616f.measure(0, 0);
            notificationPanelItemView.f6622l = notificationPanelItemView.f6616f.getMeasuredWidth();
            View focusedChild = notificationPanelItemView.getFocusedChild();
            if (focusedChild != null && notificationPanelItemView.f6622l > notificationPanelItemView.f6621k) {
                notificationPanelItemView.f6616f.setMaxLines(Integer.MAX_VALUE);
                notificationPanelItemView.f6615e.setMaxLines(2);
                notificationPanelItemView.setBackgroundColor(notificationPanelItemView.getResources().getColor(R.color.notification_expanded_text_background));
            } else {
                notificationPanelItemView.f6615e.setMaxLines(1);
                notificationPanelItemView.f6616f.setMaxLines(1);
                notificationPanelItemView.setBackgroundColor(0);
            }
            if (notificationPanelItemView.f6624n.hasFocus()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) notificationPanelItemView.f6625o.getLayoutParams();
                marginLayoutParams.setMarginStart(notificationPanelItemView.f6626p);
                notificationPanelItemView.f6625o.setLayoutParams(marginLayoutParams);
                notificationPanelItemView.f6625o.setAlpha(0.4f);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) notificationPanelItemView.f6625o.getLayoutParams();
                marginLayoutParams2.setMarginStart(0);
                notificationPanelItemView.f6625o.setLayoutParams(marginLayoutParams2);
                notificationPanelItemView.f6625o.setAlpha(1.0f);
            }
            NotificationDismissButton notificationDismissButton = notificationPanelItemView.f6624n;
            if (notificationDismissButton.hasFocus()) {
                notificationDismissButton.f6607a.setTint(notificationDismissButton.f6610d);
            } else {
                notificationDismissButton.f6607a.setTint(focusedChild == null ? notificationDismissButton.f6608b : notificationDismissButton.f6609c);
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
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0285km mo2795a(ViewGroup viewGroup, int i) {
        return new C0285km(LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.notification_panel_item_view, viewGroup, false), (byte) 0);
    }
}
