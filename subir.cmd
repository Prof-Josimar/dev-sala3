echo "# dev-sala3 %date% %time%" > README.md
git init
git add . -v
git commit -m "first commit"
git branch -M main
git remote set-url origin git@github.com:Prof-Josimar/dev-sala3.git
git push -u origin main