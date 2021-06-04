#!/usr/bin/env bash
set -e
$(command -v python3) -m venv .env

source .env/bin/activate

pip install --upgrade -r requirements.txt