package p000;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.tv.TvContract;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ChannelView;
import com.google.android.tvlauncher.home.view.ConfigureChannelsRowView;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;
import com.google.android.tvlauncher.notifications.NotificationsTrayView;
import com.google.android.tvlauncher.view.HomeTopRowView;
import com.google.android.tvlauncher.view.SearchView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: cqp */
/* compiled from: PG */
public final class cqp extends C0261jp implements AccessibilityManager.AccessibilityStateChangeListener, ddm, cex, cew, cez, cey, cit, ddn {

    /* renamed from: A */
    public boolean f6975A;

    /* renamed from: B */
    public final Handler f6976B = new Handler();

    /* renamed from: C */
    public long f6977C;

    /* renamed from: D */
    public boolean f6978D;

    /* renamed from: E */
    public final IntentFilter f6979E = new IntentFilter();

    /* renamed from: F */
    public boolean f6980F;

    /* renamed from: G */
    public final cox f6981G;

    /* renamed from: H */
    public final Handler f6982H = new Handler();

    /* renamed from: I */
    public final Runnable f6983I = new cqf(this);

    /* renamed from: J */
    public final Runnable f6984J = new cqg(this);

    /* renamed from: K */
    public final BroadcastReceiver f6985K = new cqh(this);

    /* renamed from: L */
    public final ckg f6986L = new ckg(this);

    /* renamed from: M */
    public final Runnable f6987M = new cpu(this);

    /* renamed from: N */
    public final Runnable f6988N = new cpw(this);

    /* renamed from: O */
    public final Runnable f6989O = new cpx(this);

    /* renamed from: P */
    public final Runnable f6990P = new cpy(this);

    /* renamed from: Q */
    public final Runnable f6991Q = new cqi(this);

    /* renamed from: R */
    public final cle f6992R;

    /* renamed from: S */
    private Cursor f6993S = null;

    /* renamed from: T */
    private final Set f6994T;

    /* renamed from: U */
    private final Set f6995U;

    /* renamed from: V */
    private boolean f6996V = false;

    /* renamed from: W */
    private Drawable f6997W;

    /* renamed from: X */
    private String[] f6998X;

    /* renamed from: Y */
    private ddw f6999Y;

    /* renamed from: Z */
    private int f7000Z;

    /* renamed from: aa */
    private boolean f7001aa;

    /* renamed from: ab */
    private final dbj f7002ab;

    /* renamed from: ac */
    private final Runnable f7003ac = new cpv(this);

    /* renamed from: ad */
    private final Runnable f7004ad = new cpz(this);

    /* renamed from: ae */
    private final Runnable f7005ae = new cqj(this);

    /* renamed from: af */
    private final Runnable f7006af;

    /* renamed from: ag */
    private final SharedPreferences.OnSharedPreferenceChangeListener f7007ag;

    /* renamed from: ah */
    private final crk f7008ah;

    /* renamed from: ai */
    private final csf f7009ai;

    /* renamed from: b */
    public final Context f7010b;

    /* renamed from: c */
    public final cla f7011c;

    /* renamed from: d */
    public final cfp f7012d;

    /* renamed from: e */
    public VerticalGridView f7013e;

    /* renamed from: f */
    public cpt f7014f;

    /* renamed from: g */
    public cew f7015g;

    /* renamed from: h */
    public C0512sx f7016h;

    /* renamed from: i */
    public final int f7017i;

    /* renamed from: j */
    public final C0378ny f7018j;

    /* renamed from: k */
    public final C0378ny f7019k;

    /* renamed from: l */
    public final C0378ny f7020l;

    /* renamed from: m */
    public final C0378ny f7021m;

    /* renamed from: n */
    public final C0378ny f7022n;

    /* renamed from: o */
    public final C0378ny f7023o;

    /* renamed from: p */
    public int f7024p = 0;

    /* renamed from: q */
    public final HashSet f7025q = new HashSet();

    /* renamed from: r */
    public int f7026r = 1;

    /* renamed from: s */
    public long f7027s;

    /* renamed from: t */
    public boolean f7028t;

    /* renamed from: u */
    public boolean f7029u;

    /* renamed from: v */
    public crz f7030v;

    /* renamed from: w */
    public cse f7031w;

    /* renamed from: x */
    public final Set f7032x = new HashSet();

    /* renamed from: y */
    public final Set f7033y = new HashSet();

    /* renamed from: z */
    public Cursor f7034z = null;

    public cqp(Context context, cfp cfp, cla cla, cox cox) {
        new cqk(this);
        this.f7006af = new cql(this);
        this.f7007ag = new cqm(this);
        this.f6992R = new cqc(this);
        this.f7008ah = new cqd(this);
        this.f7009ai = new cqe(this);
        this.f7010b = context;
        this.f7012d = cfp;
        this.f7011c = cla;
        this.f6981G = cox;
        this.f7002ab = ((cgg) context.getApplicationContext()).mo2750e();
        this.f6979E.addAction("android.intent.action.TIME_SET");
        this.f6979E.addAction("android.intent.action.DATE_CHANGED");
        this.f6979E.addAction("android.intent.action.TIMEZONE_CHANGED");
        this.f7017i = context.getResources().getDimensionPixelSize(R.dimen.channel_items_list_keyline);
        this.f7018j = m5523l(R.dimen.channel_items_list_apps_row_zoomed_out_notif_tray_keyline_offset);
        this.f7019k = m5523l(R.dimen.channel_items_list_apps_row_notif_tray_keyline_offset);
        this.f7020l = m5523l(R.dimen.channel_items_list_sponsored_channel_keyline_offset);
        this.f7021m = dbq.m6095a(context.getResources().getDimensionPixelSize(R.dimen.home_configure_channels_keyline_offset), Integer.valueOf((int) R.id.button));
        this.f7022n = m5523l(R.dimen.channel_items_list_second_to_last_row_zoomed_out_keyline_offset);
        this.f7023o = m5523l(R.dimen.channel_items_list_third_to_last_row_zoomed_out_keyline_offset);
        mo5308a(true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
        dck.m6123a(context);
        this.f7028t = sharedPreferences.getBoolean("show_watch_next_row_key", dck.m6124m());
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f7007ag);
        if (!ddc.f8328a) {
            Resources resources = context.getResources();
            C0497si.m8291a(context).f10364c.mo5928a(Bitmap.class, dcz.class, new ddb(context));
            C0497si.m8291a(context).f10364c.mo5928a(Bitmap.class, cjj.class, new cjl(context, dcy.m6184a(resources, (int) R.dimen.install_banner_darken_factor), dcy.m6184a(resources, (int) R.dimen.gray_scale_saturation)));
            ddc.f8328a = true;
        }
        this.f6994T = dbk.m6089a(context.getContentResolver(), "tvlauncher:blacklisted_from_watchlist");
        this.f6995U = dbk.m6089a(context.getContentResolver(), "tvlauncher:blacklisted_from_removal");
        mo3601g();
        if (this.f7028t) {
            mo3599f();
        }
        this.f6975A = true;
        mo3604i();
    }

    /* renamed from: a */
    public static int m5518a(int i, boolean z) {
        if (!z) {
            return i;
        }
        if (i == 1 || i == 2 || i == 3) {
            return 0;
        }
        return i;
    }

    /* renamed from: f */
    public static boolean m5521f(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    /* renamed from: m */
    private final int m5525m() {
        return this.f7029u ? 3 : 2;
    }

    /* renamed from: a */
    public final void mo2798a(boolean z, Pair pair) {
    }

    /* renamed from: b */
    public final void mo2799b(ArrayList arrayList) {
    }

    /* renamed from: l */
    private final C0378ny m5523l(int i) {
        return dbq.m6095a(this.f7010b.getResources().getDimensionPixelSize(i), Integer.valueOf((int) R.id.items_list));
    }

    /* renamed from: j */
    public final int mo3606j(int i) {
        return i + m5525m();
    }

    /* renamed from: h */
    public final int mo3602h() {
        if (this.f7011c.mo3073g()) {
            return this.f7011c.mo3074h();
        }
        return 0;
    }

    /* renamed from: k */
    public final int mo3608k(int i) {
        return i - m5525m();
    }

    /* renamed from: c */
    private final int m5520c(int i, boolean z) {
        int m = m5526m(i);
        if (!z) {
            return m;
        }
        switch (m) {
            case 0:
                return 18;
            case 1:
                return 19;
            case 2:
                return 20;
            case 3:
                return 21;
            case 4:
                return 22;
            case 5:
                return 23;
            case 6:
            case 13:
            case 15:
            default:
                String a = ChannelView.m5291a(m);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 47);
                sb.append("Unsupported ChannelView state ");
                sb.append(a);
                sb.append(" when it is empty");
                throw new IllegalStateException(sb.toString());
            case 7:
                return 24;
            case 8:
                return 25;
            case 9:
                return 26;
            case 10:
                return 27;
            case 11:
                return 28;
            case 12:
                return 29;
            case 14:
                return 30;
            case 16:
                return 31;
            case 17:
                return 32;
        }
    }

    /* renamed from: g */
    public final cqz mo3600g(int i) {
        cqo cqo = (cqo) this.f7013e.mo871e(i);
        if (cqo != null) {
            return cqo.f6973p;
        }
        return null;
    }

    /* renamed from: a */
    public final int mo2794a() {
        return mo3602h() + m5525m() + 1;
    }

    /* renamed from: b */
    public final long mo2835b(int i) {
        switch (mo2850a(i)) {
            case 0:
                return -2;
            case 1:
                return -3;
            case 2:
                return -4;
            case 3:
            case 4:
            case 5:
                return this.f7011c.mo3059b(mo3608k(i)).f7874a;
            case 6:
                return -5;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public final int mo2850a(int i) {
        if (i == mo2794a() - 1) {
            return 6;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2 && this.f7029u) {
            return 2;
        }
        cxt b = this.f7011c.mo3059b(mo3608k(i));
        if (b.f7880g) {
            return b.f7881h != 2 ? 4 : 5;
        }
        return 3;
    }

    /* renamed from: m */
    private final int m5526m(int i) {
        int i2 = this.f7026r;
        int i3 = this.f7024p;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return i2 != i ? 14 : 13;
                }
                if (i3 == 3) {
                    return i2 != i ? 16 : 15;
                }
                if (!(i3 == 4 || i3 == 5)) {
                    return 1;
                }
            } else if (i2 != i) {
                return (i2 == 0 && i > 0 && i <= 4) ? 12 : 11;
            } else {
                return 10;
            }
        }
        if (i3 == 4 && mo2850a(i) == 1) {
            return 6;
        }
        if (this.f7024p == 5 && i <= 3 && mo2850a(i) != 6) {
            return 5;
        }
        if (this.f7031w.f7168b && mo3603h(i)) {
            return i2 != i ? 9 : 8;
        }
        if (i2 == i) {
            return 0;
        }
        if (this.f7026r == 0 && ((i == 2 || i == 3) && mo2850a(i) != 6)) {
            return 4;
        }
        if (this.f7026r == 1 && ((i == 2 || i == 3) && mo2850a(i) != 6)) {
            return 7;
        }
        if (this.f7026r == mo2794a() - 1 && i == mo2794a() - 2) {
            return 17;
        }
        int i4 = this.f7026r;
        if (i == i4 - 1 || (i4 == mo2794a() - 1 && i == mo2794a() - 3 && mo2850a(i) != 0)) {
            return 2;
        }
        if (i == this.f7026r + 1 && i > 2) {
            return 3;
        }
        return 1;
    }

    /* renamed from: k */
    private final cqz m5522k() {
        return mo3600g(this.f7026r);
    }

    /* renamed from: h */
    public final boolean mo3603h(int i) {
        return i > 3 && i < mo2794a() + -3;
    }

    /* renamed from: a */
    public final void mo3586a(int i, cek cek) {
        cfs cfs = new cfs(i, (byte) 0);
        cfs.mo2729b(cek);
        this.f7012d.mo2714a(cfs);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cqp.a(int, boolean):int
     arg types: [int, int]
     candidates:
      cqp.a(cqo, int):void
      cqp.a(android.view.ViewGroup, int):km
      cqp.a(int, cek):void
      cqp.a(km, int):void
      cqp.a(boolean, android.util.Pair):void
      jp.a(android.view.ViewGroup, int):km
      jp.a(int, int):void
      jp.a(int, java.lang.Object):void
      jp.a(km, int):void
      cit.a(boolean, android.util.Pair):void
      cqp.a(int, boolean):int */
    public final void onAccessibilityStateChanged(boolean z) {
        int a;
        mo5306a(0, "PAYLOAD_NOTIF_TRAY_CURSOR");
        if (z && (a = m5518a(this.f7024p, true)) != this.f7024p) {
            this.f7024p = a;
            mo5305a(0, mo2794a(), "PAYLOAD_STATE");
        }
    }

    /* renamed from: a */
    public final void mo2702a(Context context) {
        if (this.f7013e.mo5622r() != 1) {
            m5524l();
        }
    }

    /* renamed from: b */
    public final void mo2703b(Context context) {
        cqz k = m5522k();
        if (k instanceof cex) {
            ((cex) k).mo2703b(context);
        } else {
            mo2702a(context);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cst.a(int, boolean):void
     arg types: [int, int]
     candidates:
      cst.a(android.view.ViewGroup, int):km
      cst.a(km, int):void
      jp.a(android.view.ViewGroup, int):km
      jp.a(int, int):void
      jp.a(int, java.lang.Object):void
      jp.a(km, int):void
      cst.a(int, boolean):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2854a(C0285km kmVar, int i, List list) {
        cqo cqo = (cqo) kmVar;
        if (list.isEmpty()) {
            mo2797a(cqo, i);
            return;
        }
        int a = mo2850a(i);
        if (list.contains("PAYLOAD_CHANNEL_ITEM_METADATA")) {
            if (a == 3) {
                ((cor) cqo.f6973p).mo3525e();
            } else if (a == 2) {
                ((csu) cqo.f6973p).mo3723c();
            }
        }
        boolean z = false;
        if (a == 2 && (list.contains("PAYLOAD_WATCH_NEXT_CARD_SELECTION_CHANGED") || list.contains("PAYLOAD_WATCH_NEXT_DATA_CHANGED"))) {
            csu csu = (csu) cqo.f6973p;
            boolean z2 = csu.f7297e.mo2794a() > 0 && csu.f7297e.mo2850a(csu.f7294b.mo5622r()) == 1;
            ChannelView channelView = csu.f7293a;
            if (z2) {
                if (channelView.f6541z) {
                    channelView.mo3378a(false);
                }
                channelView.mo3378a(true);
            } else {
                channelView.mo3378a(false);
            }
        }
        if (list.contains("PAYLOAD_STATE")) {
            if (a == 2) {
                csu csu2 = (csu) cqo.f6973p;
                int m = m5526m(i);
                if (csu2.f7293a.f6450A != m && csu2.f7298f.f7168b && csu2.f7294b.mo5622r() == 0) {
                    csu2.f7298f.mo3697b(!csu2.f7299g);
                }
                csu2.f7293a.mo3383b(m);
                int i2 = csu2.f7297e.f7281d;
                int a2 = csu.m5653a(m);
                csu2.f7297e.mo3716a(a2, true);
                csu2.mo3721a(a2, i2);
                this.f7033y.add(csu2);
            } else if (a == 3 || a == 4 || a == 5) {
                cor cor = (cor) cqo.f6973p;
                long j = this.f7011c.mo3059b(mo3608k(i)).f7874a;
                boolean a3 = this.f7011c.mo3056a(j);
                cor.mo3513a(m5520c(i, a3));
                if (a3) {
                    cox cox = this.f6981G;
                    if (this.f7026r == i) {
                        z = true;
                    }
                    cox.mo3536a(j, z);
                }
                this.f7032x.add(cor);
            } else if (a == 0) {
                HomeTopRowView homeTopRowView = (HomeTopRowView) cqo.f6973p.mo3472a();
                if (this.f7026r == i) {
                    z = true;
                }
                homeTopRowView.mo3482c(z);
            } else {
                mo2797a(cqo, i);
            }
        }
        if (list.contains("PAYLOAD_FAST_SCROLLING")) {
            if (a == 1 || a == 2 || a == 3 || a == 4 || a == 5) {
                cqo.f6973p.mo3477a(this.f7031w.f7168b);
            }
            if (a == 3 || a == 4 || a == 5) {
                ((cor) cqo.f6973p).mo3513a(m5520c(i, this.f7011c.mo3056a(this.f7011c.mo3059b(mo3608k(i)).f7874a)));
            }
        }
        if (list.contains("PAYLOAD_CHANNEL_MOVE_ACTION") && (a == 3 || a == 4 || a == 5)) {
            ((cor) cqo.f6973p).mo3520c();
        }
        if (list.contains("PAYLOAD_CHANNEL_LOGO_TITLE") && a == 3) {
            ((cor) cqo.f6973p).mo3523d();
        }
        if (a == 0) {
            HomeTopRowView homeTopRowView2 = (HomeTopRowView) cqo.f6973p.mo3472a();
            SearchView searchView = homeTopRowView2.f6702e;
            if (searchView != null) {
                if (list.contains("PAYLOAD_IDLE_STATE")) {
                    searchView.mo3493a(this.f6996V);
                }
                if (list.contains("PAYLOAD_ASSISTANT_ICON")) {
                    searchView.mo3492a(this.f6997W);
                }
                if (list.contains("PAYLOAD_ASSISTANT_SUGGESTIONS")) {
                    searchView.mo3495a(this.f6998X);
                }
                if (list.contains("PAYLOAD_MIC_STATUS")) {
                    searchView.mo3491a(this.f7000Z);
                }
                if (list.contains("PAYLOAD_HOTWORD_STATUS")) {
                    searchView.mo3497b(this.f7001aa);
                }
            }
            if (list.contains("PAYLOAD_PARTNER_WIDGET_INFO")) {
                homeTopRowView2.mo3476a(this.f6999Y);
            }
            if (list.contains("PAYLOAD_NOTIF_COUNT_CURSOR")) {
                homeTopRowView2.f6704g.mo3975a(this.f6993S);
            }
            if (list.contains("PAYLOAD_NOTIF_TRAY_CURSOR")) {
                homeTopRowView2.mo3481c().mo3985a(this.f7034z);
                homeTopRowView2.mo3479b();
            }
            if (list.contains("PAYLOAD_INPUT_ICON_VISIBILITY")) {
                homeTopRowView2.mo3480b(this.f6980F);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void mo2797a(cqo cqo, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        dad dad;
        int i2;
        cqo cqo2 = cqo;
        int i3 = i;
        int a = mo2850a(i3);
        int i4 = this.f7026r;
        int i5 = 0;
        if (i4 == i3) {
            z = true;
        } else {
            z = false;
        }
        if (a == 2) {
            csu csu = (csu) cqo2.f6973p;
            int m = m5526m(i3);
            if (csu.f7297e == null) {
                csu.f7297e = new cst(csu.f7293a.getContext(), csu.f7295c);
                cst cst = csu.f7297e;
                cst.f7283f = csu.f7300h;
                cst.f7284g = csu;
                cst.f7285h = csu;
                cst.f7286i = csu.f7303k;
                csu.f7294b.mo831a(cst);
                csu.f7298f = new cse(csu.f7294b, new ctv());
                cse cse = csu.f7298f;
                cse.f7167a = 550;
                cse.f7173g = csu;
                csu.mo3722b();
                csu.f7296d = new csl(csu.f7293a.f6533r);
            }
            csu.f7293a.mo3383b(m);
            int i6 = csu.f7297e.f7281d;
            int a2 = csu.m5653a(m);
            cst cst2 = csu.f7297e;
            cst2.f7281d = a2;
            if (!cst2.mo3717d()) {
                cst2.f7282e = -1;
                cst2.mo5303O();
            }
            cst2.f7287j = true;
            csu.mo3721a(a2, i6);
            if (m == 0) {
                csu.mo3723c();
            }
            csu.mo3477a(this.f7031w.f7168b);
            this.f7033y.add(csu);
        } else if (a == 1) {
            cpq cpq = (cpq) cqo2.f6973p;
            int m2 = m5526m(i3);
            if (cpq.f6925d == null) {
                cpq.f6925d = new cpo(cpq.f6922a.getContext(), cpq.f6924c);
                cpo cpo = cpq.f6925d;
                cpo.f6913s = cpq.f6927f;
                cpo.f6914t = cpq;
                cpo.f6915u = cpq;
                cpo.f6916v = cpq;
                cpo.f6917w = cpq.f6930i;
                cpq.f6923b.mo831a(cpo);
                cpq.f6926e = new cse(cpq.f6923b, new ctv());
                cpq.mo3563b();
            }
            cpq.f6922a.mo3383b(m2);
            cpo cpo2 = cpq.f6925d;
            int i7 = cpo2.f6897c;
            switch (m2) {
                case 0:
                    i2 = 2;
                    break;
                case 1:
                    i2 = 0;
                    break;
                case 2:
                case 17:
                    i2 = 1;
                    break;
                case 3:
                case 4:
                case 7:
                case 8:
                case 9:
                case 13:
                case 15:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                    String valueOf = String.valueOf(ChannelView.m5291a(m2));
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported Apps row state ") : "Unsupported Apps row state ".concat(valueOf));
                case 5:
                    i2 = 9;
                    break;
                case 6:
                    i2 = 8;
                    break;
                case 10:
                    i2 = 4;
                    break;
                case 11:
                    i2 = 3;
                    break;
                case 12:
                    i2 = 5;
                    break;
                case 14:
                    i2 = 6;
                    break;
                case 16:
                    i2 = 7;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i7 != i2) {
                cpo2.f6897c = i2;
                cpo2.f6898d = -1;
                cpo2.mo5305a(0, cpo2.mo2794a(), "PAYLOAD_STATE");
            }
            if (i2 != i7 && ((i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) && cpq.f6925d.mo2794a() > 1 && cpq.f6923b.mo5622r() != 0)) {
                cpq.f6923b.mo5619k(0);
            }
            cpq.mo3477a(this.f7031w.f7168b);
            if (this.f6978D && i3 == this.f7026r) {
                cpq.mo3564c();
                this.f6978D = false;
            }
        } else if (a == 6) {
            cov cov = (cov) cqo2.f6973p;
            int i8 = this.f7024p;
            int a3 = mo2850a(i3 - 1);
            int i9 = cov.f6847g;
            int i10 = cov.f6844d;
            if (i8 != 0) {
                if (i8 == 1) {
                    i9 = cov.f6848h;
                } else if (i8 == 2) {
                    i9 = cov.f6849i;
                } else if (i8 == 3) {
                    i9 = cov.f6850j;
                }
                i10 = cov.f6846f;
            } else if (a3 == 1) {
                i10 = cov.f6845e;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cov.f6841a.getLayoutParams();
            marginLayoutParams.setMarginStart(i9);
            cov.f6841a.setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) cov.f6842b.getLayoutParams();
            marginLayoutParams2.topMargin = i10;
            cov.f6842b.setLayoutParams(marginLayoutParams2);
            if (z) {
                cov.f6842b.setBackgroundColor(cov.f6852l);
                cov.f6842b.setScaleX(cov.f6851k);
                cov.f6842b.setScaleY(cov.f6851k);
            } else {
                cov.f6842b.setBackgroundColor(cov.f6853m);
                cov.f6842b.setScaleX(1.0f);
                cov.f6842b.setScaleY(1.0f);
            }
            int i11 = cov.f6842b.getLayoutParams().width;
            int i12 = cov.f6842b.getLayoutParams().height;
            if (i11 <= 0 || i12 <= 0) {
                i11 = cov.f6842b.getWidth();
                i12 = cov.f6842b.getHeight();
            }
            if (i11 > 0 && i12 > 0) {
                if (cov.f6842b.getLayoutDirection() == 1) {
                    cov.f6842b.setPivotX((float) i11);
                } else {
                    cov.f6842b.setPivotX(0.0f);
                }
                cov.f6842b.setPivotY((float) i12);
            }
            ConfigureChannelsRowView configureChannelsRowView = cov.f6841a;
            if (i4 != i3) {
                i5 = 4;
            }
            configureChannelsRowView.f6556c = i5;
            configureChannelsRowView.f6555b.setVisibility(i5);
        } else if (a == 3 || a == 4 || a == 5) {
            cor cor = (cor) cqo2.f6973p;
            cxt b = this.f7011c.mo3059b(mo3608k(i3));
            long j = b.f7874a;
            boolean a4 = this.f7011c.mo3056a(j);
            int c = m5520c(i3, a4);
            boolean z5 = !this.f6994T.contains(b.f7879f);
            boolean z6 = !this.f6995U.contains(b.f7879f);
            long j2 = cor.f6818f;
            cor.f6818f = b.f7874a;
            cor.f6820h = b.f7876c;
            cor.f6819g = b.f7875b;
            cor.f6821i = b.f7879f;
            cor.f6824l = b.f7884k;
            cor.f6834v = b.f7882i;
            cor.f6835w = b.f7883j;
            if (cor.f6825m == null) {
                cor.f6825m = new coo(cor.f6813a.getContext(), cor);
                coo coo = cor.f6825m;
                boolean z7 = cor.f6832t;
                boolean z8 = cor.f6833u;
                coo.f6796m = z7;
                coo.f6797n = z8;
                coo.f6790g = cor.f6827o;
                coo.f6791h = cor;
                coo.f6792i = cor;
                coo.f6793j = cor.f6830r;
                cor.f6814b.mo831a(coo);
                cor.f6826n = new cse(cor.f6814b, new ctv());
                cor.f6826n.f7173g = cor;
                cor.mo3517b();
            }
            dad dad2 = cor.f6831s;
            if (!(dad2 == null || cor.f6818f == j2)) {
                dad2.mo4031b();
            }
            cok cok = cor.f6816d;
            boolean z9 = cor.f6824l;
            cok.f6182F = z9;
            ChannelView channelView = cor.f6813a;
            channelView.f6451B = cor.f6834v;
            channelView.f6452C = cor.f6835w;
            if (!z9 && !cor.f6832t) {
                z3 = z5;
                z2 = z6;
            } else {
                z3 = false;
                z2 = false;
            }
            if (!cor.f6832t) {
                z4 = false;
                cor.mo3523d();
            } else if (cor.f6833u) {
                z4 = false;
                channelView.mo3384b(String.format(cor.f6822j, b.f7878e));
            } else {
                z4 = false;
            }
            if (!cor.f6832t || cor.f6833u) {
                cor.f6813a.mo3386c(cor.f6819g);
                cor.f6813a.f6522g.setText(cor.f6819g);
            }
            cor.mo3520c();
            if (!dcy.m6190a(c) || (dad = cor.f6831s) == null || !dad.f8024h) {
                cor.mo3528h();
            } else {
                dad.mo4031b();
            }
            if (!cor.f6832t || cor.f6833u) {
                cla a5 = cla.m5025a(cor.f6813a.getContext());
                Long valueOf2 = Long.valueOf(b.f7874a);
                Uri uri = (Uri) a5.f5881i.get(valueOf2);
                if (uri == null) {
                    uri = TvContract.buildChannelLogoUri(valueOf2.longValue()).buildUpon().appendQueryParameter("t", String.valueOf(System.currentTimeMillis())).build();
                    a5.f5881i.put(valueOf2, uri);
                }
                C0509su d = cor.f6815c.mo5949d();
                d.mo5939a(uri);
                C0509su d2 = cor.f6815c.mo5949d();
                d2.mo5939a(cor.f6823k);
                d.f10413a = d2;
                d.mo5937a((ahg) cor.f6817e);
                cor.f6823k = uri;
            }
            cor.f6813a.mo3383b(c);
            int i13 = cor.f6825m.f6788e;
            int b2 = cor.m5412b(c);
            cor.f6825m.mo3509a(b.f7874a, cor.f6821i, b2, z3, z2, cor.f6824l);
            cor.mo3514a(b2, i13);
            if (c == 0) {
                cor.mo3525e();
            }
            if (a4) {
                cox cox = this.f6981G;
                if (this.f7026r == i3) {
                    z4 = true;
                }
                cox.mo3536a(j, z4);
            }
            cor.mo3477a(this.f7031w.f7168b);
            this.f7032x.add(cor);
        } else if (a == 0) {
            HomeTopRowView homeTopRowView = (HomeTopRowView) cqo2.f6973p.mo3472a();
            homeTopRowView.mo3481c().mo3985a(this.f7034z);
            homeTopRowView.f6704g.mo3975a(this.f6993S);
            homeTopRowView.mo3479b();
            homeTopRowView.mo3482c(z);
            SearchView searchView = homeTopRowView.f6702e;
            searchView.mo3493a(this.f6996V);
            searchView.mo3492a(this.f6997W);
            searchView.mo3495a(this.f6998X);
            searchView.mo3491a(this.f7000Z);
            searchView.mo3497b(this.f7001aa);
            homeTopRowView.mo3476a(this.f6999Y);
            homeTopRowView.mo3480b(this.f6980F);
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
        boolean z;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            HomeTopRowView homeTopRowView = (HomeTopRowView) from.inflate((int) R.layout.home_top_row, viewGroup, false);
            homeTopRowView.f6705h = this;
            homeTopRowView.f6700c = this.f7012d;
            homeTopRowView.f6707j = this;
            cyl cyl = new cyl(viewGroup.getContext(), this.f7012d);
            viewGroup.getContext();
            cyt cyt = new cyt(this.f7012d, this.f7034z);
            NotificationsTrayView notificationsTrayView = homeTopRowView.f6703f;
            notificationsTrayView.f6682a.mo831a(cyt);
            notificationsTrayView.mo3457a();
            homeTopRowView.f6704g = cyl;
            NotificationsPanelButtonView notificationsPanelButtonView = (NotificationsPanelButtonView) homeTopRowView.findViewById(R.id.notification_panel_button);
            cyl cyl2 = homeTopRowView.f6704g;
            if (notificationsPanelButtonView != null) {
                cyl2.f7920c = notificationsPanelButtonView;
                cyl2.f7920c.setOnClickListener(new cyk(cyl2));
                cyl2.mo3974a();
            }
            return new cqo(this, homeTopRowView);
        } else if (i == 1) {
            ChannelView channelView = (ChannelView) from.inflate((int) R.layout.home_channel_row, viewGroup, false);
            channelView.setId(R.id.apps_row);
            cpq cpq = new cpq(channelView, this.f7012d);
            cpq.f6928g = this;
            cpq.f6929h = this;
            cpq.f6930i = this.f7009ai;
            return new cqo(this, cpq);
        } else if (i == 2) {
            csu csu = new csu((ChannelView) from.inflate((int) R.layout.home_channel_row, viewGroup, false), this.f7012d);
            csu.f7300h = this.f7008ah;
            csu.f7301i = this;
            csu.f7302j = this;
            csu.f7303k = this.f7009ai;
            return new cqo(this, csu);
        } else if (i == 6) {
            return new cqo(this, new cov((ConfigureChannelsRowView) from.inflate((int) R.layout.home_configure_channels_row, viewGroup, false)));
        } else {
            ChannelView channelView2 = (ChannelView) from.inflate((int) R.layout.home_channel_row, viewGroup, false);
            cqn cqn = new cqn(this);
            C0512sx sxVar = this.f7016h;
            cla cla = this.f7011c;
            if (cla.mo3073g()) {
                cjs cjs = cla.f5895w;
                cok cok = new cok(channelView2.f6533r);
                dbj dbj = this.f7002ab;
                boolean z2 = i == 4 || i == 5;
                if (i == 4) {
                    z = true;
                } else {
                    z = false;
                }
                cor cor = new cor(channelView2, sxVar, cqn, cjs, cok, dbj, z2, z);
                cor.f6827o = this.f7008ah;
                cor.f6828p = this;
                cor.f6829q = this;
                cor.f6830r = this.f7009ai;
                cqo cqo = new cqo(this, cor);
                cqn.f6971a = cqo;
                return cqo;
            }
            throw new IllegalStateException("Home channel data not loaded yet");
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo3596c(C0285km kmVar) {
        cqo cqo = (cqo) kmVar;
        String valueOf = String.valueOf(cqo);
        String valueOf2 = String.valueOf(cqo.f6973p);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29 + String.valueOf(valueOf2).length());
        sb.append("onFailedToRecycleView: h=");
        sb.append(valueOf);
        sb.append(", r=");
        sb.append(valueOf2);
        Log.w("HomeController", sb.toString());
    }

    /* renamed from: c */
    public final void mo2704c(Context context) {
        if (this.f7013e.mo5622r() != 1) {
            m5524l();
        }
    }

    /* renamed from: d */
    public final void mo2705d(Context context) {
        if (SystemClock.elapsedRealtime() - this.f6977C <= 200) {
            cqz k = m5522k();
            if (k instanceof cez) {
                ((cez) k).mo2705d(context);
            } else {
                mo2704c(context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3590a(Boolean bool) {
        this.f7001aa = bool != null ? bool.booleanValue() : false;
        mo5306a(0, "PAYLOAD_HOTWORD_STATUS");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3597c(boolean z) {
        this.f6996V = z;
        this.f6976B.removeCallbacks(this.f7004ad);
        this.f6976B.postDelayed(this.f7004ad, 500);
    }

    /* renamed from: i */
    public final void mo3605i(int i) {
        int i2;
        this.f6981G.mo3534a();
        int a = mo2794a() - 1;
        int i3 = this.f7026r;
        if (i3 > i) {
            this.f7026r = i3 - 1;
        }
        long j = this.f7027s;
        mo3604i();
        if (j != this.f7027s && ((i2 = this.f7024p) == 3 || i2 == 2)) {
            this.f7024p = 1;
        }
        if (this.f7024p == 1 && dcy.m6193b(this.f7010b)) {
            this.f7024p = 0;
        }
        mo5314e(i);
        mo5305a(0, mo2794a(), "PAYLOAD_STATE");
        int m = m5525m();
        if (i == m && i != a) {
            mo5306a(i, "PAYLOAD_CHANNEL_MOVE_ACTION");
        }
        if (i == a && i != m) {
            mo5306a(i - 1, "PAYLOAD_CHANNEL_MOVE_ACTION");
        }
    }

    /* renamed from: a */
    public final void mo2796a(ArrayList arrayList) {
        mo5305a(m5525m(), mo2794a(), "PAYLOAD_CHANNEL_LOGO_TITLE");
    }

    /* renamed from: d */
    public final void mo2801d() {
        mo5305a(m5525m(), mo2794a(), "PAYLOAD_CHANNEL_LOGO_TITLE");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3591a(Integer num) {
        this.f7000Z = num != null ? num.intValue() : 0;
        mo5306a(0, "PAYLOAD_MIC_STATUS");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3589a(ddw ddw) {
        this.f6999Y = ddw;
        mo5306a(0, "PAYLOAD_PARTNER_WIDGET_INFO");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3588a(Drawable drawable) {
        this.f6997W = drawable;
        mo5306a(0, "PAYLOAD_ASSISTANT_ICON");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3592a(String[] strArr) {
        this.f6998X = strArr;
        mo5306a(0, "PAYLOAD_ASSISTANT_SUGGESTIONS");
    }

    /* renamed from: j */
    public final void mo3607j() {
        mo3586a(32, dhs.f8560x);
        try {
            this.f7010b.startActivity(new Intent("android.settings.SETTINGS"));
        } catch (ActivityNotFoundException e) {
            Log.e("HomeController", "Exception starting settings", e);
            Context context = this.f7010b;
            Toast.makeText(context, context.getString(R.string.app_unavailable), 0).show();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2853a(C0285km kmVar) {
        cqz cqz = ((cqo) kmVar).f6973p;
        if (cqz instanceof cor) {
            cor cor = (cor) cqz;
            coo coo = cor.f6825m;
            coo.mo3509a(-1, null, coo.f6788e, false, false, false);
            coo.f6795l = false;
            coo.f6789f = -1;
            coo.mo5303O();
            cor.f6814b.mo5617i(0);
            ChannelView channelView = cor.f6813a;
            channelView.f6523h.setImageDrawable(null);
            channelView.mo3378a(false);
            cor.f6816d.mo3167a();
            cor.f6823k = null;
            dad dad = cor.f6831s;
            if (dad != null) {
                dad.mo4031b();
            }
            this.f7032x.remove(cor);
        } else if (cqz instanceof csu) {
            csu csu = (csu) cqz;
            cst cst = csu.f7297e;
            cst.f7282e = -1;
            cst.mo3718e();
            csu.f7296d.mo3707a();
            this.f7033y.remove(csu);
        } else if (cqz instanceof HomeTopRowView) {
            ((HomeTopRowView) cqz).mo3481c().mo3985a((Cursor) null);
        }
    }

    /* renamed from: g */
    public final void mo3601g() {
        cla cla = this.f7011c;
        ckg ckg = this.f6986L;
        if (!cla.f5874b.contains(ckg)) {
            cla.f5874b.add(ckg);
        }
        cla.mo3061b();
        if (!this.f7011c.mo3073g() || this.f7011c.f5886n) {
            this.f7011c.mo3077k();
        }
    }

    /* renamed from: f */
    public final void mo3599f() {
        this.f7011c.mo3055a(this.f6992R);
        if (!this.f7011c.mo3075i() || this.f7011c.f5892t) {
            this.f7011c.mo3080n();
            this.f7011c.mo3081o();
            return;
        }
        mo3598e();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cqp.b(int, boolean):void
     arg types: [int, int]
     candidates:
      jp.b(int, int):void
      cqp.b(int, boolean):void */
    /* renamed from: l */
    private final void m5524l() {
        this.f6978D = true;
        if (this.f7013e.mo5622r() > 6 || dcy.m6195d(this.f7010b)) {
            this.f7013e.suppressLayout(true);
            this.f7013e.mo5617i(1);
            mo3593b(1, true);
            this.f7013e.suppressLayout(false);
            return;
        }
        this.f7013e.mo5618j(1);
    }

    /* renamed from: b */
    public final void mo3593b(int i, boolean z) {
        if (this.f7026r != i) {
            if (this.f7024p != 0 || !this.f7031w.f7168b || !mo3603h(i)) {
                if (this.f7026r >= m5525m() && this.f7026r < mo2794a() - 1 && this.f7011c.mo3056a(this.f7027s)) {
                    this.f6976B.post(new cqb(this, this.f7027s));
                }
                int i2 = this.f7024p;
                if ((i2 == 0 || i2 == 1) && z) {
                    this.f7025q.add(Integer.valueOf(this.f7026r));
                    this.f7026r = i;
                    mo3604i();
                    this.f6976B.removeCallbacks(this.f7003ac);
                    if (this.f7013e.mo892l()) {
                        Log.w("HomeController", "setSelectedPosition: still computing layout => scheduling");
                        this.f6976B.post(this.f7003ac);
                    } else {
                        this.f7003ac.run();
                    }
                } else {
                    this.f7026r = i;
                    mo3604i();
                }
                if (this.f7026r <= 1 && this.f7014f != null) {
                    this.f6976B.postDelayed(this.f7005ae, 2000);
                } else {
                    this.f6976B.removeCallbacks(this.f7005ae);
                }
            } else {
                this.f7026r = i;
                mo3604i();
            }
            if (this.f6978D && i == 1) {
                this.f6976B.removeCallbacks(this.f7006af);
                if (dcy.m6193b(this.f7010b)) {
                    this.f6976B.postDelayed(this.f7006af, 50);
                } else {
                    this.f7006af.run();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo3595b(boolean z) {
        if (this.f7029u != z) {
            this.f7029u = z;
            if (!z) {
                int i = this.f7026r;
                if (i > 2) {
                    this.f7026r = i - 1;
                }
                mo5314e(2);
                mo5305a(0, mo2794a(), "PAYLOAD_STATE");
            } else {
                int i2 = this.f7026r;
                if (i2 >= 2) {
                    this.f7026r = i2 + 1;
                }
                mo5313d(2);
                mo5305a(0, mo2794a(), "PAYLOAD_STATE");
            }
            mo3604i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3587a(Cursor cursor) {
        Cursor cursor2 = this.f7034z;
        this.f7034z = cursor;
        if (cursor2 != null) {
            cursor2.close();
        }
        mo5306a(0, "PAYLOAD_NOTIF_TRAY_CURSOR");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3594b(Cursor cursor) {
        this.f6993S = cursor;
        mo5306a(0, "PAYLOAD_NOTIF_COUNT_CURSOR");
    }

    /* renamed from: i */
    public final void mo3604i() {
        this.f7027s = mo2835b(Math.min(this.f7026r, mo2794a() - 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo3598e() {
        boolean z;
        if (this.f7011c.mo3076j() > 0) {
            z = true;
        } else {
            z = false;
        }
        mo3595b(z);
    }
}
