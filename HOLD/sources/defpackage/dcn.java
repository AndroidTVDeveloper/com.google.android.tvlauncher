package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dcn  reason: default package */
/* compiled from: PG */
public final class dcn {
    public static /* synthetic */ int R;
    private static final long S = TimeUnit.SECONDS.toMillis(20);
    public dch A = null;
    public dai B = null;
    public int C = -1;
    public String D = null;
    public String E = null;
    public String F = null;
    public boolean G;
    public boolean H;
    public final ArraySet I = new ArraySet(1);
    public final List J = new ArrayList();
    public String K = null;
    public boolean L = true;
    public boolean M = true;
    public boolean N = true;
    public boolean O = true;
    public final List P = new ArrayList();
    public final Map Q = new HashMap();
    private final List T = new ArrayList(5);
    private final HashMap U = new HashMap(20);
    private boolean V = false;
    private boolean W = false;
    private int X = -1;
    private int Y = -1;
    private final HashMap Z = new HashMap();
    public Uri a = null;
    private final int aa;
    private boolean ab;
    private boolean ac = false;
    private int ad = -1;
    private final Context ae;
    private SharedPreferences af;
    public int b = -1;
    public boolean c = false;
    public Uri d = null;
    public String e = null;
    public boolean f = true;
    public String g = null;
    public boolean h = false;
    public Uri i = null;
    public boolean j = true;
    public boolean k = false;
    public String l = "inputs";
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public String p = null;
    public boolean q;
    public final List r = new ArrayList(8);
    public final List s = new ArrayList(10);
    public final List t = new ArrayList(8);
    public final List u = new ArrayList(20);
    public final List v = new ArrayList(10);
    public final List w = new ArrayList(1);
    public final List x = new ArrayList(2);
    public final List y = new ArrayList(5);
    public String z = null;

    public dcn(Context context, int i2) {
        boolean z2;
        boolean z3;
        this.ae = context;
        this.aa = i2;
        this.G = false;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("oem_config", 0);
            this.af = sharedPreferences;
            if (sharedPreferences.getLong("time_stamp", -1) != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.G = z2;
            this.ab = this.af.getBoolean("has_seen_sponsored_channels", false);
            if (i2 > this.af.getInt("oem_config_package_ver", -1)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.af.getBoolean("refresh_oem_configuration_data", false)) {
                this.af.edit().putBoolean("refresh_oem_configuration_data", false).apply();
                z3 = true;
            }
            if (this.G) {
                if (z3) {
                    a(true);
                } else {
                    a(false);
                    return;
                }
            }
            dcm dcm = new dcm(this, this.ae);
            dcm.executeOnExecutor(daz.a, new Void[0]);
            this.H = true;
            new Handler().postDelayed(new dcl(this, dcm), S);
        }
    }

    public final void b(String str, String str2, boolean z2) {
        if ((!z2 || !this.G) && !this.u.contains(str2)) {
            this.u.add(str2);
            this.Z.put(str2, str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2) {
        this.U.put(str, Integer.valueOf(i2));
    }

    public final void a(String str, boolean z2) {
        if ((!z2 || !this.G) && !this.w.contains(str)) {
            this.w.add(str);
        }
    }

    public final boolean a(String str, String str2, boolean z2) {
        if ((z2 && this.G) || this.t.contains(str2) || this.x.contains(str2)) {
            return false;
        }
        this.t.add(str2);
        this.Z.put(str2, str);
        return true;
    }

    public final void c(String str, String str2, boolean z2) {
        if ((!z2 || !this.G) && !this.v.contains(str2)) {
            this.v.add(str2);
            this.Z.put(str2, str);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2) {
        if (this.x.contains(str2) || this.t.contains(str2) || this.x.size() >= 2) {
            return false;
        }
        this.x.add(str2);
        this.Z.put(str2, str);
        return true;
    }

    private final void a(dai dai) {
        this.Q.put(dai.a(dai.a, dai.b), dai);
    }

    public final void a(dah dah, boolean z2) {
        int i2;
        boolean z3 = false;
        if (z2 && this.G) {
            z3 = true;
        }
        if (!z3 || !this.ab) {
            boolean z4 = dah.d;
            if (z4) {
                this.ac = true;
            }
            if (!z3) {
                if (TextUtils.isEmpty(dah.b) || !this.Q.containsKey(dai.a(dah.a, dah.b))) {
                    dai dai = this.B;
                    if (dai != null && TextUtils.equals(dai.a, dah.a)) {
                        Log.e("OemConfigurationData", "Live TV OOB channel order has already been defined.");
                        return;
                    }
                    int i3 = this.ad + 1;
                    this.ad = i3;
                    dah.c = i3;
                    dai a2 = dah.a();
                    this.s.add(a2);
                    if (a2.d) {
                        this.J.add(a2);
                    }
                    a(a2);
                    return;
                }
                String str = dah.a;
                String str2 = dah.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 92 + String.valueOf(str2).length());
                sb.append("channel with package = ");
                sb.append(str);
                sb.append(" with system_channel_key = ");
                sb.append(str2);
                sb.append(" has already appeared in out-of-box order.");
                Log.e("OemConfigurationData", sb.toString());
            } else if (z4) {
                if (this.Q.containsKey(dai.a(dah.a, dah.b))) {
                    i2 = this.s.indexOf(dah.a());
                } else if (this.Q.containsKey(dai.a(dah.a, null))) {
                    List list = this.s;
                    dah dah2 = new dah();
                    dah2.a = dah.a;
                    dah2.b = null;
                    i2 = list.indexOf(dah2.a());
                } else {
                    String str3 = dah.a;
                    String str4 = dah.b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 148 + String.valueOf(str4).length());
                    sb2.append("The sponsored channel is skipped because it did not exist before in the previous configuration with the same package name: ");
                    sb2.append(str3);
                    sb2.append(" and system_channel_key: ");
                    sb2.append(str4);
                    Log.e("OemConfigurationData", sb2.toString());
                    return;
                }
                if (i2 != -1) {
                    dah.c = i2;
                    dai a3 = dah.a();
                    this.s.set(i2, a3);
                    a(a3);
                    this.J.add(a3);
                    return;
                }
                String str5 = dah.a;
                String str6 = dah.b;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 105 + String.valueOf(str6).length());
                sb3.append("The sponsored channel with package name: ");
                sb3.append(str5);
                sb3.append(" and system_channel_key: ");
                sb3.append(str6);
                sb3.append(" does not exist in out of box ordering.");
                throw new IllegalStateException(sb3.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (!this.r.contains(str)) {
            this.r.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        if (!this.y.contains(str)) {
            this.y.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        if (!this.T.contains(str)) {
            this.T.add(str);
        }
    }

    public final void a() {
        this.G = true;
        this.H = false;
        this.af.edit().putInt("content_provider_query_count", 0).apply();
        for (dcj a2 : new ArraySet(this.I)) {
            a2.a();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(int, boolean):void
     arg types: [int, int]
     candidates:
      dcn.a(dah, boolean):void
      dcn.a(dch, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, boolean):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(dah, boolean):void
     arg types: [dah, int]
     candidates:
      dcn.a(int, boolean):void
      dcn.a(dch, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, boolean):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(dah, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(java.lang.String, java.lang.String, boolean):boolean
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      dcn.a(java.util.Collection, java.lang.String, android.content.SharedPreferences$Editor):void
      dcn.a(java.lang.String, java.lang.String, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      dcn.a(int, boolean):void
      dcn.a(dah, boolean):void
      dcn.a(dch, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcn.a(dch, boolean):void
     arg types: [dch, int]
     candidates:
      dcn.a(int, boolean):void
      dcn.a(dah, boolean):void
      dcn.a(java.lang.String, int):void
      dcn.a(java.lang.String, boolean):void
      dcn.a(java.lang.String, java.lang.String):boolean
      dcn.a(dch, boolean):void */
    private final void a(boolean z2) {
        String str;
        JSONArray jSONArray;
        dah dah;
        String str2 = null;
        String string = this.af.getString("live_tv_channel_out_of_box_package_name", null);
        boolean z3 = false;
        if (string != null) {
            d(string, this.af.getString("live_tv_channel_out_of_box_system_channel_key", null), false);
            a(this.af.getInt("live_tv_channel_out_of_box_position", -1), false);
        }
        String string2 = this.af.getString("channels_out_of_box_ordering", null);
        if (!TextUtils.isEmpty(string2)) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(string2)) {
                try {
                    JSONArray jSONArray2 = new JSONArray(string2);
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                        try {
                            String string3 = jSONObject.getString("pkgName");
                            String optString = jSONObject.optString("sysChannelKey", str2);
                            int i3 = jSONObject.getInt("chanPos");
                            boolean z4 = jSONObject.getBoolean("isSponsored");
                            boolean optBoolean = jSONObject.optBoolean("isGoogleConfig", z3);
                            boolean z5 = jSONObject.getBoolean("canMoveChannel");
                            boolean z6 = jSONObject.getBoolean("canHideChannel");
                            jSONArray = jSONArray2;
                            try {
                                dah = new dah();
                                dah.a = string3;
                                dah.b = optString;
                                dah.c = i3;
                                dah.d = z4;
                                dah.e = optBoolean;
                                dah.f = z5;
                                dah.g = z6;
                            } catch (JSONException e2) {
                            }
                        } catch (JSONException e3) {
                            jSONArray = jSONArray2;
                            String valueOf = String.valueOf(jSONObject);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("JSONException. Could not deserialize jsonObject: ");
                            sb.append(valueOf);
                            Log.e("ChannelInfo", sb.toString());
                            dah = null;
                            arrayList.add(dah);
                            i2++;
                            jSONArray2 = jSONArray;
                            str2 = null;
                            z3 = false;
                        }
                        arrayList.add(dah);
                        i2++;
                        jSONArray2 = jSONArray;
                        str2 = null;
                        z3 = false;
                    }
                } catch (JSONException e4) {
                    String valueOf2 = String.valueOf(string2);
                    Log.e("ChannelInfo", valueOf2.length() == 0 ? new String("JSONException in fromJson. Could not deserialize from jsonArrayStr: ") : "JSONException in fromJson. Could not deserialize from jsonArrayStr: ".concat(valueOf2));
                }
            }
            if (arrayList.isEmpty()) {
                for (String str3 : string2.split(",\\|,")) {
                    int indexOf = str3.indexOf(":");
                    if (indexOf != -1) {
                        String substring = str3.substring(0, indexOf);
                        str = str3.substring(indexOf + 1);
                        str3 = substring;
                    } else {
                        str = null;
                    }
                    dah dah2 = new dah();
                    dah2.a = str3;
                    dah2.b = str;
                    a(dah2, false);
                }
                this.af.edit().putString("channels_out_of_box_ordering", dai.a(this.s).toString()).apply();
            } else {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    a((dah) arrayList.get(i4), false);
                }
            }
        }
        HashMap hashMap = new HashMap();
        String string4 = this.af.getString("appname_package_map", null);
        if (string4 != null) {
            String[] split = string4.split(",\\|,");
            if (split.length > 1) {
                for (int i5 = 0; i5 < split.length; i5 += 2) {
                    hashMap.put(split[i5], split[i5 + 1]);
                }
            }
        }
        String string5 = this.af.getString("favorite_apps_out_of_box_ordering", null);
        if (string5 != null) {
            for (String str4 : string5.split(",\\|,")) {
                String str5 = (String) hashMap.get(str4);
                if (str5 != null) {
                    a(str5, str4, false);
                }
            }
        }
        String string6 = this.af.getString("all_apps_out_of_box_ordering", null);
        if (string6 != null) {
            for (String str6 : string6.split(",\\|,")) {
                String str7 = (String) hashMap.get(str6);
                if (str7 != null) {
                    b(str7, str6, false);
                }
            }
        }
        String string7 = this.af.getString("games_out_of_box_ordering", null);
        if (string7 != null) {
            for (String str8 : string7.split(",\\|,")) {
                String str9 = (String) hashMap.get(str8);
                if (str9 != null) {
                    c(str9, str8, false);
                }
            }
        }
        String string8 = this.af.getString("configure_channels_app_ordering", null);
        if (string8 != null) {
            for (String a2 : string8.split(",\\|,")) {
                a(a2, false);
            }
        }
        a(dch.a(this.af.getString("apps_view_layout_option_tag", null)), false);
        if (!z2) {
            String string9 = this.af.getString("search_icon", null);
            this.a = string9 != null ? Uri.parse(string9) : null;
            if (this.af.contains("search_orb_focused_color")) {
                a(this.af.getInt("search_orb_focused_color", 0));
            }
            String string10 = this.af.getString("inputs_icon", null);
            this.i = string10 != null ? Uri.parse(string10) : null;
            String string11 = this.af.getString("bundled_tuner_banner", null);
            this.d = string11 != null ? Uri.parse(string11) : null;
            this.e = this.af.getString("bundled_tuner_title", null);
            if (this.af.contains("disable_disconnected_inputs")) {
                this.f = this.af.getBoolean("disable_disconnected_inputs", true);
            }
            if (this.af.contains("enable_input_state_icon")) {
                this.h = this.af.getBoolean("enable_input_state_icon", false);
            }
            if (this.af.contains("apply_standard_style_to_input_state_icons")) {
                this.j = this.af.getBoolean("apply_standard_style_to_input_state_icons", true);
            }
            if (this.af.contains("show_inputs")) {
                this.k = this.af.getBoolean("show_inputs", false);
            }
            if (this.af.contains("inputs_panel_label_option")) {
                this.l = this.af.getString("inputs_panel_label_option", null);
            }
            if (this.af.contains("show_physical_inputs_separately")) {
                this.m = this.af.getBoolean("show_physical_inputs_separately", false);
            }
            if (this.af.contains("use_custom_input_list")) {
                this.n = this.af.getBoolean("use_custom_input_list", false);
            }
            String string12 = this.af.getString("home_screen_inputs_ordering", null);
            if (string12 != null) {
                for (String a3 : string12.split(",\\|,")) {
                    a(a3);
                }
            }
            String string13 = this.af.getString("package_notification_whitelist", null);
            if (string13 != null) {
                for (String b2 : string13.split(",\\|,")) {
                    b(b2);
                }
            }
            String string14 = this.af.getString("app_channel_quota", null);
            if (string14 != null) {
                String[] split2 = string14.split(",\\|,");
                if (split2.length > 1) {
                    for (int i6 = 0; i6 < split2.length; i6 += 2) {
                        try {
                            a(split2[i6], Integer.decode(split2[i6 + 1]).intValue());
                        } catch (NumberFormatException e5) {
                            String valueOf3 = String.valueOf(split2[i6 + 1]);
                            Log.e("OemConfigurationData", valueOf3.length() == 0 ? new String("Bad quota number: ") : "Bad quota number: ".concat(valueOf3));
                        }
                    }
                }
            }
            this.z = this.af.getString("headsup_notifications_font", null);
            if (this.af.contains("headsup_notifications_text_color")) {
                b(this.af.getInt("headsup_notifications_text_color", 0));
            }
            if (this.af.contains("headsup_notifications_background_color")) {
                c(this.af.getInt("headsup_notifications_background_color", 0));
            }
            this.D = this.af.getString("headsup_notifications_location", null);
            if (this.af.contains("force_launch_package_after_boot")) {
                this.o = this.af.getBoolean("force_launch_package_after_boot", false);
            }
            this.p = this.af.getString("package_name_launch_after_boot", null);
            this.q = this.af.getBoolean("use_main_intent", false);
            String string15 = this.af.getString("pinned_favorite_apps", null);
            if (string15 != null) {
                for (String str10 : string15.split(",\\|,")) {
                    String str11 = (String) hashMap.get(str10);
                    if (str11 != null) {
                        a(str11, str10);
                    }
                }
            }
            String string16 = this.af.getString("hidden_uninstall_package_list", null);
            if (string16 != null) {
                for (String c2 : string16.split(",\\|,")) {
                    c(c2);
                }
            }
            if (this.af.contains("home_background_uri")) {
                this.K = this.af.getString("home_background_uri", null);
            }
            if (this.af.contains("app_recommendations_content_provider_package")) {
                this.E = this.af.getString("app_recommendations_content_provider_package", null);
            }
            if (this.af.contains("widget_content_provider_package")) {
                this.F = this.af.getString("widget_content_provider_package", null);
            }
            if (this.af.contains("show_add_to_watch_next_from_program_menu")) {
                this.L = this.af.getBoolean("show_add_to_watch_next_from_program_menu", true);
            }
            if (this.af.contains("show_remove_program_from_program_menu")) {
                this.M = this.af.getBoolean("show_remove_program_from_program_menu", true);
            }
            if (this.af.contains("watch_next_channel_enabled_by_default")) {
                this.N = this.af.getBoolean("watch_next_channel_enabled_by_default", true);
            }
            if (this.af.contains("watch_next_channel_auto_hide_enabled_2")) {
                this.O = this.af.getBoolean("watch_next_channel_auto_hide_enabled_2", true);
            }
        }
    }

    public final void b() {
        boolean z2;
        SharedPreferences.Editor edit = this.af.edit();
        edit.clear();
        edit.putLong("time_stamp", System.currentTimeMillis());
        Uri uri = this.a;
        if (uri != null) {
            edit.putString("search_icon", uri.toString());
        }
        if (this.c) {
            edit.putInt("search_orb_focused_color", this.b);
        }
        Uri uri2 = this.i;
        if (uri2 != null) {
            edit.putString("inputs_icon", uri2.toString());
        }
        Uri uri3 = this.d;
        if (uri3 != null) {
            edit.putString("bundled_tuner_banner", uri3.toString());
        }
        edit.putString("bundled_tuner_title", this.e);
        edit.putBoolean("disable_disconnected_inputs", this.f);
        edit.putBoolean("enable_input_state_icon", this.h);
        edit.putBoolean("show_inputs", this.k);
        edit.putString("inputs_panel_label_option", this.l);
        edit.putBoolean("show_physical_inputs_separately", this.m);
        edit.putBoolean("use_custom_input_list", this.n);
        a(this.r, "home_screen_inputs_ordering", edit);
        a(this.T, "package_notification_whitelist", edit);
        dai dai = this.B;
        if (dai != null) {
            edit.putString("live_tv_channel_out_of_box_package_name", dai.a);
            edit.putString("live_tv_channel_out_of_box_system_channel_key", this.B.b);
            edit.putInt("live_tv_channel_out_of_box_position", this.C);
        }
        edit.putString("channels_out_of_box_ordering", dai.a(this.s).toString());
        if (this.ab || this.ac) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.ab = z2;
        edit.putBoolean("has_seen_sponsored_channels", z2);
        if (!this.Z.isEmpty()) {
            StringBuilder sb = new StringBuilder(128);
            for (Map.Entry entry : this.Z.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(",|,");
                sb.append((String) entry.getValue());
                sb.append(",|,");
            }
            edit.putString("appname_package_map", sb.toString());
        }
        a(this.t, "favorite_apps_out_of_box_ordering", edit);
        a(this.u, "all_apps_out_of_box_ordering", edit);
        a(this.v, "games_out_of_box_ordering", edit);
        a(this.w, "configure_channels_app_ordering", edit);
        a(this.x, "pinned_favorite_apps", edit);
        a(this.y, "hidden_uninstall_package_list", edit);
        if (!this.U.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(128);
            for (Map.Entry entry2 : this.U.entrySet()) {
                sb2.append((String) entry2.getKey());
                sb2.append(",|,");
                sb2.append(entry2.getValue());
                sb2.append(",|,");
            }
            edit.putString("app_channel_quota", sb2.toString());
        }
        edit.putString("headsup_notifications_font", this.z);
        if (this.V) {
            edit.putInt("headsup_notifications_text_color", this.X);
        }
        if (this.W) {
            edit.putInt("headsup_notifications_background_color", this.Y);
        }
        edit.putString("headsup_notifications_location", this.D);
        dch dch = this.A;
        if (dch != null) {
            edit.putString("apps_view_layout_option_tag", dch.b);
        }
        if (this.o) {
            edit.putBoolean("force_launch_package_after_boot", true);
        }
        String str = this.p;
        if (str != null) {
            edit.putString("package_name_launch_after_boot", str);
        }
        edit.putBoolean("use_main_intent", this.q);
        edit.putString("home_background_uri", this.K);
        edit.putString("app_recommendations_content_provider_package", this.E);
        edit.putString("widget_content_provider_package", this.F);
        edit.putBoolean("show_add_to_watch_next_from_program_menu", this.L);
        edit.putBoolean("show_remove_program_from_program_menu", this.M);
        edit.putBoolean("watch_next_channel_enabled_by_default", this.N);
        edit.putBoolean("watch_next_channel_auto_hide_enabled_2", this.O);
        edit.putInt("oem_config_package_ver", this.aa);
        edit.apply();
    }

    public final void a(dch dch, boolean z2) {
        if (!z2 || !this.G) {
            this.A = dch;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        this.Y = i2;
        this.W = true;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        this.X = i2;
        this.V = true;
    }

    public final void a(int i2, boolean z2) {
        if (!z2 || !this.G) {
            this.C = i2;
        }
    }

    public final void d(String str, String str2, boolean z2) {
        if (!z2 || !this.G) {
            List list = this.s;
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                if (!((dai) list.get(i2)).a.equals(str)) {
                    i2 = i3;
                } else {
                    Log.e("OemConfigurationData", "Live TV Package cannot be declared in both live channel out-of-box ordering and channels out-of-box ordering.");
                    return;
                }
            }
            dah dah = new dah();
            dah.a = str;
            dah.b = str2;
            this.B = dah.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.b = i2;
        this.c = true;
    }

    private static void a(Collection collection, String str, SharedPreferences.Editor editor) {
        if (!collection.isEmpty()) {
            StringBuilder sb = new StringBuilder(128);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(",|,");
            }
            editor.putString(str, sb.toString());
        }
    }
}
