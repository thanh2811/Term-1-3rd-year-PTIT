SELECT DISTINCT NV.MaNV, NV.Ten, TMP.SL
FROM NhanVien AS NV,(SELECT MaNVVC, COUNT(MaGD) AS SL
						FROM GiaoDich
						GROUP BY MaNVVC) AS TMP,  NhanVienVC AS VC, GiaoDich
WHERE VC.MaNVVC = NV.MaNV
AND TMP.MaNVVC = NV.MaNV
AND TMP.SL = (SELECT MAX(TMP2.SL)
				FROM (SELECT MaNVVC, COUNT(MaGD) AS SL
						FROM GiaoDich
						GROUP BY MaNVVC) AS TMP2)

AND GiaoDich.NgayGiao >= "2020-12-01";
